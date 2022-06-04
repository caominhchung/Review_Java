package cmc.entrytest.linh;
import java.util.Scanner;
public class NguyenQuangLinh_BT1 {
    //Kiểm tra năm nhuận
    public static void workLesson1() {
        /**
         * Nhận xét:
         * tên biến là 1 danh từ và bắt đầu là kí tự thường, nếu có từ 2 danh từ trở lên thì từ kí tự thứ 2 trở đi sẽ viết hoa chữ cái đầu
         * khởi tạo 1 biến local boolean không cần set giá trị default. Ví dụ khởi tạo boolean namNhuan; không cần boolean namNhuan = false;
         * khi sử dụng các khối đk if else, for, while, ... nên sử dụng 2 dấu {} để có thể xác định rõ được phạm vi hoạt động của khối điều kiện đó
         * nên trình bày if-else rõ ràng như BT4
         * nên sử dụng dấu cách sau 2 thành phần để code dc đẹp nhất (ví dụ: Nam = scan.nextInt();) hoặc trong trường hợp quên thì
         * code xong có thể sử dụng Ctrl + Alt + L để format lại đoạn code
         * */
        int nam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam ");
        nam = scanner.nextInt();
        scanner.close();
        boolean namNhuan;
        if( nam % 4 == 0)
        {
            if( nam % 100 == 0)
                {
                    if( nam % 400 == 0)
                        namNhuan = true;
                    else
                        namNhuan = false;
                }
            else
                namNhuan = true;
        }
        else { //else ở đây có ý nghĩa là nếu năm không chia hết cho 4 thì nó sẽ nhảy vào else này. Mà lại set namNhuan = true trong đây?????
            namNhuan = false;
        }
        if(namNhuan==true)
            System.out.println(nam+"la nam nhuan");
        else
            System.out.println(nam + "Khong phai la nam nhuan.");

    }
}

