package DSAStackQueue.TH1;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyGenericStack<T> {
    // Khai báo LinkedList để lưu trữ các phần tử trong ngăn xếp
    private LinkedList<T> stack;

    // Hàm khởi tạo, tạo một ngăn xếp rỗng
    public MyGenericStack() {
        stack = new LinkedList<>();


    }

    // Phương thức thêm một phần tử vào đầu ngăn xếp
    public void push(T element) {
        stack.addFirst(element);
    }

    // Phương thức lấy và loại bỏ phần tử ở đầu ngăn xếp
    public T pop() {
        if (isEmpty()) {
            // Ném ra ngoại lệ nếu ngăn xếp rỗng
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // Phương thức trả về số phần tử trong ngăn xếp
    public int size() {
        return stack.size();
    }

    // Phương thức kiểm tra ngăn xếp có rỗng hay không
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
