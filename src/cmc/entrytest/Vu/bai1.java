import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if(a % 4 ==0){
            System.out.println(a + " là năm nhuận");
        }
        else{
            System.out.println(a + " không phải năm nhuận");
        }
    }
}

