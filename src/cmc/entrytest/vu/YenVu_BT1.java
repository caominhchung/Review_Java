package cmc.entrytest.vu;

import java.util.Scanner;
public class YenVu_BT1 {
    public static void workLesson1() {
        /**
         * Nhận xét:
         * Đặt tên biến phải có ý nghĩa cho nhiệm vụ của biến đó, ví dụ nhập năm thì tên biến nên là nam hoặc year
         * kiểm tra lại định nghĩa xác định năm nhuận, đang thiếu điều kiện
         * */
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if(a % 4 ==0){ //* nên sử dụng dấu cách sau 2 thành phần để code dc đẹp nhất (ví dụ: Nam = scan.nextInt();) hoặc trong trường hợp quên thì code xong có thể sử dụng Ctrl + Alt + L để format lại đoạn code
            System.out.println(a + " là năm nhuận");
        }
        else{
            System.out.println(a + " không phải năm nhuận");
        }
    }
}

