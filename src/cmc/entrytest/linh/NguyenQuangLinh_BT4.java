package cmc.entrytest.linh;

import java.util.Scanner;
public class NguyenQuangLinh_BT4 {
    //giải phương trình bậc nhất
    public static void workLesson4() {
        /**
         * không nên khởi tạo int cho 2 biến đồng thời, nên khởi tạo riêng. ví dụ: int a; int b;
         * logic đúng, trình bày khối lệnh if else rõ ràng nên format lại code cho chuẩn coding convention
         * nên đặt tên biến có ý nghĩa, không nên đặt chung chung như Scanner sc ...
         * */
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a= sc.nextInt();
        System.out.println("nhap b:");
        b=sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("PTVSN");
            }
            else {
                System.out.println("PTVN");
            }
        }
        else {
            float x=(float) -b/a;
            System.out.println("PT co 1 nghiem duy nhat"+x);
        }
    }
}
