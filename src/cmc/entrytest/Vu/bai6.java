import java.util.*;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
