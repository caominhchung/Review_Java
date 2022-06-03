package cmc.entrytest.linh;

import java.util.Scanner;
public class NguyenQuangLinh_BT7 {
    public static void workLesson7() {
        /**
         * nên thêm 1 bước nhập số phần từ của mảng trước, chứ ngồi nhập hết 10000 phần tử của mảng thì cũng hơi căng :))
         * format lại code
         * */
        int a[]=new int [10000];
        int tong =0;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<10000;i++)
        {
            a[i]=sc.nextInt();
            tong=tong+a[i];
        }
        System.out.println("Tong cac phan tu trong mang la:"+tong);
    }
}
