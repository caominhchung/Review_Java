package cmc.entrytest.linh;

public class NguyenQuangLinh_BT6 {
    //tìm số nguyên tố từ 1 đến 100
    public static void workLesson6() {
        /**
         *
         * */
        for(int i=2;i<=100;i++)
        {
            boolean SNT=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0){
                    SNT= false;
                    break;
                }
            }
            if(SNT){
                System.out.println(i);
            }
        }
    }
}
