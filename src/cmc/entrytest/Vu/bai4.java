import java.util.*;
public class bai4 {
    public static void main(String[] args) {
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
