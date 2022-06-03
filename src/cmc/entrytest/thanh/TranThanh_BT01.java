import java.util.Scanner;
public class TranThanh_BT01 {
    public static void workLesson1(){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao nam : ");
        year =scan.nextInt();
        scan.close();
        boolean NamNhuan = false;
        if(year % 4 ==0)
        {
            if(year %100==0)
            {
                if(year %400==0)
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
            System.out.println(year+"la nam nhuan");
        else
            System.out.println(year + "Khong phai la nam nhuan.");

    }
}

