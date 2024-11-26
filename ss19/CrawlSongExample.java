package ss19;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

        public static void main(String[] args) {  // Phương thức chính, nơi chương trình bắt đầu thực thi
            try {  // Khối try-catch để xử lý ngoại lệ
                // Khởi tạo đối tượng URL với địa chỉ trang web cần truy cập
                URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

                // Mở một stream từ URL và sử dụng Scanner để đọc dữ liệu từ stream
                Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

                // Đặt delimiter cho Scanner là chuỗi "\Z", có nghĩa là nó sẽ đọc toàn bộ nội dung của stream (đến khi hết)
                scanner.useDelimiter("\\Z");

                // Đọc toàn bộ nội dung của stream vào biến content
                String content = scanner.next();

                // Đóng đối tượng Scanner sau khi sử dụng
                scanner.close();

                // Loại bỏ tất cả các ký tự xuống dòng (new line) trong nội dung đã đọc
                content = content.replaceAll("\\n+", "");

                // Tạo biểu thức chính quy để tìm tất cả các chuỗi nằm giữa "name_song"> và </a>
                // Đây là cách để lấy tên bài hát từ HTML (dựa vào mã nguồn HTML của trang web)
                Pattern p = Pattern.compile("name_song\">(.*?)</a>");

                // Tạo đối tượng Matcher để tìm kiếm tất cả các kết quả phù hợp với biểu thức chính quy
                Matcher m = p.matcher(content);

                // Duyệt qua tất cả các kết quả tìm được và in ra tên bài hát (group 1 là phần trong dấu ngoặc của biểu thức chính quy)
                while (m.find()) {
                    System.out.println(m.group(1));  // In ra tên bài hát
                }
            } catch (IOException e) {  // Xử lý trường hợp lỗi (ví dụ: nếu không thể kết nối với URL hoặc đọc dữ liệu)
                e.printStackTrace();  // In thông tin chi tiết về lỗi ra màn hình
            }
        }
    }


