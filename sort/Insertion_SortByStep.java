package sort;

import java.util.Scanner;

public class Insertion_SortByStep {
    public static void insertionSort(int[] arr) {
        System.out.println("Mảng ban đầu: ");
        printArray(arr);
        System.out.println("-------------------------------");

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key một vị trí sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Hiển thị trạng thái mảng sau mỗi bước chèn
            System.out.println("Bước " + i + ": Chèn " + key);
            printArray(arr);
        }
    }

    // Hàm in mảng ra màn hình
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n--- Bắt đầu sắp xếp chèn ---");
        insertionSort(arr);
        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(arr);

        scanner.close();
    }
}
