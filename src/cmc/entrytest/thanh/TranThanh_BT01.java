package cmc.entrytest.thanh;

import java.util.Scanner;

public class TranThanh_BT01 {
    public static void workLesson1() {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam :");
        year = scanner.nextInt();
        scanner.close();
        boolean namnhuan = false;
        if (year % 4 ==0){
            if (year%100==0){
                if (year % 400 ==0)
                    namnhuan = true;
                else
                    namnhuan=false;
            }
            else
                namnhuan=true;

        }
        else {
            namnhuan=false;
        }
        if (namnhuan==true)
            System.out.println(year + " la nam nhuan");
        else
            System.out.println(year +" khong phai nam nhuan");
    }
}
