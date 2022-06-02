import java.sql.SQLOutput;
import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
       int Nam;
       int b;
       Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao nam ");
        Nam=scan.nextInt();
        scan.close();
        boolean NamNhuan = false;
        if(Nam % 4 ==0)
        {
            if(Nam %100==0)
            {
                if(Nam %400==0)
                    NamNhuan = true;
                else
                    NamNhuan = false;
            }
            else
                NamNhuan =true;
        }
        else {
            NamNhuan=true;
        }
        if(NamNhuan==true)
            System.out.println(Nam+"la nam nhuan");
        else
            System.out.println(Nam + "Khong phai la nam nhuan.");

    }
}

