import java.util.Scanner;
public class BT3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Nhap n");
        n=sc.nextInt();
        if(n<1||n>12){
            System.out.println("Sai");
        }
        else {
            if(n==1){
                System.out.println("Thang Mot");
            } else if (n==2) {
                System.out.println("THang Hai");
            } else if (n==3) {
                System.out.println("Thang Ba");
            }else if (n==4){
                System.out.println("Thang Tu");
            } else if (n==5) {
                System.out.println("Thang Nam");
            } else if (n==6) {
                System.out.println("Thang Sau");
            } else if (n==7) {
                System.out.println("Thang Bay ");
            } else if (n==8) {
                System.out.println("Thang Tam ");
            } else if (n==9) {
                System.out.println("Thang Chin");
            } else if (n==10) {
                System.out.println("Thang Muoi");
            } else if (n==11) {
                System.out.println("Thang Muoi Mot");
            } else if (n==12) {
                System.out.println("Thang Muoi Hai");
            }
        }

    }
}
