import java.util.*;
public class bai5 {
    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        String  SoNguyenTo = "";
        for (i = 1; i <= 100; i++)
        {
            int count=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    count = count + 1;
                }
            }
            if (count ==2)
            {
                SoNguyenTo = SoNguyenTo + i + " ";
            }
        }
        System.out.println(SoNguyenTo);
    }
}
