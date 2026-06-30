package TCS_code;

public class Large {
    public static void main(String[] args) {
        int num = 4573;
        int large = -9999;
        while(num!=0){
            int last = num%10;
            if(large<last){
                large = last;
            }
            num = num / 10;
        }
        System.out.println(large);
    }
}
