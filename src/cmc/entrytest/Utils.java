package cmc.entrytest;

import java.util.regex.Pattern;

public class Utils {
    private static final String YEAR_REGEX = "[1-9]\\d\\d\\d";

    public static boolean isNumber(String input) {
        System.out.println("Kiểm tra " + input + " có phải là số thỏa mãn điều kiện đầu vào?");
        effect();
        if (Pattern.matches(YEAR_REGEX, input)) {
            System.out.println(input + " là số thỏa mãn tiêu chuẩn đầu vào");
            System.out.println("Tiếp tục kiểm tra số " + input + " có phải là năm nhuận không.");
            return true;
        }
        System.out.println(input + " không phải là số thỏa mãn :((");
        return false;
    }

    public static void effect() {
        StringBuilder effectStart = new StringBuilder();
        StringBuilder effectEnd = new StringBuilder();
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                effectStart.append("--> ");
                effectEnd.append("<-- ");
                System.out.println(effectStart);
                Thread.sleep(1000);
            }

            System.out.println(effectEnd);

            for (int i = 5; i > 0; i--){
                Thread.sleep(1000);
                effectEnd.delete(effectEnd.length() - 4, effectEnd.length());
                System.out.println(effectEnd);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
