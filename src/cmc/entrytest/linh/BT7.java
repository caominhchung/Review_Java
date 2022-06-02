import java.util.Scanner;
public class BT7 {
    public static void main(String[] args) {
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
