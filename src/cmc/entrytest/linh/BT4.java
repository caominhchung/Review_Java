import java.util.Scanner;
public class BT4 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a= sc.nextInt();
        System.out.println("nhap b:");
        b=sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("PTVSN");
            }
            else {
                System.out.println("PTVN");
            }
        }
        else {
            float x=(float) -b/a;
            System.out.println("PT co 1 nghiem duy nhat"+x);
        }
    }
}
