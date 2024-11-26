package Introduction_to_Java;

import java.util.Scanner;

public class usd_vnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số USD:");
        int USD = scanner.nextInt();
        int VND = USD*25000;
        System.out.print("Đổi sang tiền VND :"+ VND);
        int c = USD ++ + ++VND;
        System.out.print("Đổi sang tiền VND :"+ c);

    }
}
