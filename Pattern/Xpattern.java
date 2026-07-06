package TCS_code.Pattern;

public class Xpattern {
    public static void main(String[] args) {
        int n = 11;
        // for(int i=0;i<n;i++){
        //     for(int j = 0;j<n;j++){
        //         if(i==j||(j==n-1-i)){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         } 
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==j||(j==n-i+1)||i==n||j==1||i==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }
    }
}
