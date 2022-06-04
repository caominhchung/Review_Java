package cmc.entrytest.linh;

import java.util.Scanner;
public class NguyenQuangLinh_BT5 {
    //giải ptb2
    public static void workLesson5() {
        /**
         * nên khởi tạo cho từng biến 1 chứ không khởi tạo gộp nhiều biến
         * đặt tên biến cho có ý nghĩa: sc....
         * cách làm chính xác, nên format lại code theo chuẩn coding convention
         * */
        double a;double b;double c;double x1;double x2;double delta;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a:");
        a = scanner.nextDouble();
        System.out.println("nhap b");
        b=scanner.nextDouble();
        System.out.println("nhap c");
        c=scanner.nextDouble();
        delta= Math.pow(b,2)-4*a*c;
        if(delta<0)
            {
                System.out.println("PTVN");
            } else if (delta==0)
                {
                    x1=-b/(2*a);
                    System.out.println("PT co nghiem kep x1=x2="+x1);
                }
        else {
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("PT co nghiem");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}
