package cmc.entrytest.thanh;

import java.util.Scanner;

public class TranThanh_BT02 {
    public static void  workLesson2() {

                int number;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap thang : ");
                number = scanner.nextInt();

                switch (number){
                    case 1: System.out.println("Một"); break;
                    case 2: System.out.println("Hai"); break;
                    case 3: System.out.println("Ba"); break;
                    case 4: System.out.println("Bốn"); break;
                    case 5: System.out.println("Năm"); break;
                    case 6: System.out.println("Sáu"); break;
                    case 7: System.out.println("Bảy"); break;
                    case 8: System.out.println("Tám"); break;
                    case 9: System.out.println("Chín"); break;
                    case 10: System.out.println("Mười"); break;
                    case 11: System.out.println("Mười một"); break;
                    case 12: System.out.println("Mười hai"); break;
                }

            }
        }