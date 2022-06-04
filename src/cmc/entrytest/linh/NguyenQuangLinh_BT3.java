package cmc.entrytest.linh;

import java.util.Scanner;
public class NguyenQuangLinh_BT3 {
    //in ra tên tháng
    public static void workLesson3() {
        /**
         * xem lại cách đặt tên biến, đặt tên biến phải có ý nghĩa
         * format lại code cho đẹp, đúng tiêu chuẩn
         * ý tưởng check điều kiện là tháng hay k thì chính xác, nhưng nếu nhập sai mà chỉ in ra là Sai và dừng chương trình luôn thì
         * không được best practice, nên sử dụng do-while để cho người dùng nhập lại (có thể tham khảo ở class Lesson1)
         * Tuyệt đối không dùng if else-if quá 3 lần, nên sử dụng switch case thay thế cho nhiều lần sử dụng if else
         * */
        Scanner scanner= new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        System.out.println("Nhap n:");
           switch (n) {
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
