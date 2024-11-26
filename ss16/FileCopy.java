package ss16;
import java.io.*;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên tệp nguồn
        System.out.print("Nhập đường dẫn đến tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        // Nhập tên tệp đích
        System.out.print("Nhập đường dẫn đến tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra nếu tệp nguồn không tồn tại
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        // Kiểm tra nếu tệp đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("Cảnh báo: Tệp đích đã tồn tại. Vui lòng chọn tên tệp khác.");
            return;
        }

        // Sao chép nội dung từ tệp nguồn sang tệp đích
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(targetFile)) {

            int byteCount = 0; // Biến đếm số ký tự
            int byteData;

            // Đọc từng byte từ tệp nguồn và ghi vào tệp đích
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
                byteCount++;
            }

            System.out.println("Sao chép thành công! Số ký tự trong tệp: " + byteCount);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}
