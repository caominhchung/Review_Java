package cmc.entrytest.thanh;

import java.util.Scanner;

public class TranThanh_BT04 {
    public void workLesson4(float a,float b) {

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

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        float a, b;
        System.out.println("Nhap a : ");
        a = scanner.nextFloat();
        System.out.println("Nhap b : ");
       workLesson4(a,b);
       System.out.println("ket thuc chuong trinh");
    }
}
