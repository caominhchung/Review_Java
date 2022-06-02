public class BT6 {
    public static void main(String[] args) {
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
