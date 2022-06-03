package cmc.entrytest;

import cmc.entrytest.linh.NguyenQuangLinh_BT1;
import cmc.entrytest.linh.NguyenQuangLinh_BT2;
import cmc.entrytest.linh.NguyenQuangLinh_BT3;
import cmc.entrytest.linh.NguyenQuangLinh_BT4;
import cmc.entrytest.thanh.BTVN0002;
import cmc.entrytest.thanh.BTVN0003;
import cmc.entrytest.vu.YenVu_BT1;
import cmc.entrytest.vu.YenVu_BT2;
import cmc.entrytest.vu.YenVu_BT3;
import cmc.entrytest.vu.YenVu_BT4;

import java.util.Locale;
import java.util.Scanner;
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

            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000);
                effectEnd.delete(effectEnd.length() - 4, effectEnd.length());
                System.out.println(effectEnd);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String enterName(Scanner scanner) {
        System.out.println("Vui lòng nhập tên của bạn");
        return scanner.nextLine();
    }

    public static int getIdUser(String input) {
        switch (input.toUpperCase(Locale.ROOT)) {
            case CommonConstant.NAME_LINH:
                return 1;
            case CommonConstant.NAME_VU:
                return 2;
            case CommonConstant.NAME_THANH:
                return 3;
            default:
                System.out.println("không tìm thấy user");
                return 0;
        }
    }

    public static void checkHomeWork(int idUser, Scanner scanner) {
        String number;
        while (true) {
            System.out.println("Hello " + (idUser == 1 ? CommonConstant.NAME_LINH : (idUser == 2 ? CommonConstant.NAME_VU : CommonConstant.NAME_THANH)) + ". Vui lòng chọn để check bài tập");
            CommonConstant.displayTest1();
            number = scanner.nextLine();
            switch (number) {
                case "1":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        NguyenQuangLinh_BT1.workLesson1();
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        YenVu_BT1.workLesson1();
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "2":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        NguyenQuangLinh_BT2.workLesson2();
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        YenVu_BT2.workLesson2();
                    } else {
                        //Trường hợp của Thành
                        BTVN0002.workLesson2();

                    }
                    break;
                case "3":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        NguyenQuangLinh_BT3.workLesson3();
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        YenVu_BT3.workLesson3();
                    } else {
                        //Trường hợp của Thành
                        BTVN0003.workLesson3();

                    }
                    break;
                case "4":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        NguyenQuangLinh_BT4.workLesson4();
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        YenVu_BT4.workLesson4();
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "5":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "6":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "7":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "8":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "9":
                    if (idUser == 1) {
                        //Trường hợp của Linh
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else if (idUser == 2) {
                        //Trường hợp của Vũ
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    } else {
                        //Trường hợp của Thành
                        System.out.println(CommonConstant.NOT_DONE); //nếu đã làm thì gọi hàm đã làm vào đây
                    }
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn chưa đúng chức năng. Chọn lại: ");
                    break;
            }
        }
    }
}
