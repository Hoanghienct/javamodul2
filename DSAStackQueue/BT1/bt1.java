package DSAStackQueue.BT1;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class bt1 <T>{
    // Khai báo LinkedList để lưu trữ các phần tử trong ngăn xếp
    private LinkedList<T> stack;

    // Hàm khởi tạo, tạo một ngăn xếp rỗng
    public bt1() {
        stack = new LinkedList<>();
    }

    // Phương thức thêm một phần tử vào đầu ngăn xếp
    public void push(T element) {
        stack.addFirst(element);
    }
    // Phương thức trả về số phần tử trong ngăn xếp
    public int size() {
        return stack.size();
    }

}
