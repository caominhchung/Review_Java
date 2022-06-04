package cmc.entrytest.thanh;

import java.util.Scanner;

public class TranThanh_BT04 {
    public static void workLesson4() {

        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a= scanner.nextInt();
        System.out.println("Nhap b : ");
        b= scanner.nextInt();

       if (a==0){
           if (b == 0){
               System.out.println("Phuong trinh vo so nghiem");
           }else {
               System.out.println("Phuong trinh vo nghiem");
           }
       }else {
           float nghiem = -b / a ;
           System.out.println("Phuong trinh co 1 nghiem : " + nghiem);
       }

    }


}
