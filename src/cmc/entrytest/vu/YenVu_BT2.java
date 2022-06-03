package cmc.entrytest.vu;

import java.util.*;
public class YenVu_BT2 {
    public static void workLesson2() {
        /**
         * đặt tên biến có ý nghĩa
         * nên sử dụng default để in ra message cho tháng không phù hợp
         * trừ việc đặt tên biến thì trình bày rất tốt => 9 điểm rưỡi
         * */
        Scanner scanner= new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Tháng Một");
                break;
            case 2:
                System.out.println("Tháng Hai");
                break;
            case 3:
                System.out.println("Tháng Ba");
                break;
            case 4:
                System.out.println("Tháng Bốn");
                break;
            case 5:
                System.out.println("Tháng Năm");
                break;
            case 6:
                System.out.println("Tháng Sáu");
                break;
            case 7:
                System.out.println("Tháng Bảy");
                break;
            case 8:
                System.out.println("Tháng Tám");
                break;
            case 9:
                System.out.println("Tháng Chín");
                break;
            case 10:
                System.out.println("Tháng Mười");
                break;
            case 11:
                System.out.println("Tháng Mười Một");
                break;
            case 12:
                System.out.println("Tháng Mười Hai");
                break;
        }
    }
}
