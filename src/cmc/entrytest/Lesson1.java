package cmc.entrytest;

import java.util.Scanner;

public class Lesson1 {
    /**
     * Viết chương trình kiểm tra năm nhuận
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean check;
        do {
            System.out.println("Nhập năm: (1000 -> 9999)");
            input = scanner.nextLine();
            check = Utils.isNumber(input);
            if (check && (input.length() != 4 || "0000".equals(input))) {
                System.out.println("Vui lòng nhập năm trong phạm vi (1000-9999)");
            }
        } while (!check);
        int inputInt = Integer.parseInt(input);
        Utils.effect();
        if (inputInt % 4 == 0 && inputInt % 100 != 0) {
            System.out.println("Năm " + input + " là năm nhuận!");
        } else {
            System.out.println("Năm " + input + " không phải là năm nhuận!");
        }
    }
}
