package cmc.entrytest;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = Utils.enterName(scanner);
        int userId = Utils.getIdUser(name);
        while (userId == 0) {
            System.out.println("Vui lòng nhập lại tên: ");
            name = Utils.enterName(scanner);
            userId = Utils.getIdUser(name);
        }
        Utils.checkHomeWork(userId, scanner);
    }
}
