package cmc.entrytest.thanh;

import java.util.Scanner;

public class TranThanh_BT05 {
    public static void main(String[] args) {
        double a,b,c,x1 , x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a(a # 0):");
        a = scanner.nextDouble();
        System.out.println("Nhap b :");
        b = scanner.nextDouble();
        System.out.println("Nhap c :");
        c = scanner.nextDouble();
        delta = Math.pow(b,2)-4*a*c;
        if (delta<0){
            System.out.println("vo nghiem");

        }else if (delta == 0){
            x1 = -b/( 2 * a);
            System.out.println("Phuong trinh co 1 nghiem la x1 =x2 = " + x1);

        }else {
            x1 = (-b + Math.sqrt(delta)) / ( 2*a);
            x2 = (-b - Math.sqrt(delta)) / ( 2*a);
            System.out.println("phuong trinh co 2 nghiem x1 =" +x1 +" va x2 =" +x2);

        }
    }
}
