package cmc.entrytest.vu;

import java.util.*;
public class YenVu_BT6 {
    /**
     * bài làm tốt
     * format lại code
     * */
    public static void workLesson6() {
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
