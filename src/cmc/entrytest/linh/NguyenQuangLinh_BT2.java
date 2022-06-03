package cmc.entrytest.linh;

public class NguyenQuangLinh_BT2 {
    //tính tổng từ 1 đến 10
    public static void workLesson2() {
        /**
         * cách làm đúng, cơ mà làm nhầm thứ tự bài
         * đọc lại cách trình bày ở BT1 để format lại đoạn code cho đẹp
         * */
        int tong =0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                tong+=i;
            }
        }
        System.out.println("tong la:"+tong);
    }
}
