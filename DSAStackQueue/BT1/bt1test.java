package DSAStackQueue.BT1;

import DSAStackQueue.TH1.MyGenericStack;
import java.util.Stack;
import java.sql.Array;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class bt1test {
        public static void reverseArray(int[] array) {
            Stack<Integer> stack = new Stack<>();

            // Đẩy các phần tử của mảng vào ngăn xếp
            for (int value : array) {
                stack.push(value);
            }

            // Lấy các phần tử ra khỏi ngăn xếp và gán lại vào mảng để đảo ngược
            for (int i = 0; i < array.length; i++) {
                array[i] = stack.pop();
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            System.out.println("Mảng ban đầu:");
            for (int value : array) {
                System.out.print(value + " ");
            }

            // Đảo ngược mảng
            reverseArray(array);

            System.out.println("\nMảng sau khi đảo ngược:");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }

}
