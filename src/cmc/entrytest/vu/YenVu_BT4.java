package cmc.entrytest.vu;

import java.util.*;
public class YenVu_BT4 {
    /**
     * Tách ra hàm con để làm ngắn gọn hàm main -> ý tưởng và thực hiện rất tôt
     * tên hàm: bắt đầu là động từ và chứ cái đầu là chữ thường... ví dụ: nhapSoNguyen
     * format lại code
     * nhìn chung là bài này làm rất tốt
     * */
    public static void workLesson4() {
        int a;
        int b;
        a=NhapSoNguyen("nhap so a: ");
        b=NhapSoNguyen("nhap so b: ");
        PTBM(a,b);
    }

    public static int NhapSoNguyen(String str){
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.println(str);
        x=sc.nextInt();
        return x;
    }

    public static void PTBM(int a,int b) {
        if(a==0){
            if(b==0)
                System.out.println("Phuong trinh vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        }
        else System.out.println("Phuong trinh co nghiem x= : " +(-b/a) );
    }
}
