package TCS_code.Pattern;

public class Alpha {
    public static void main(String[] args) {
        int n= 8;
        int ch = 65;
        // for (int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         char al = (char) (ch+j);
        //         System.out.print(al+" ");
        //     }
        //     System.out.println();
        // }

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //char al = (char) (ch+j);
                System.out.print((char) (ch)+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
