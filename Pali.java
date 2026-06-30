package TCS_code;

public class Pali {
    public static void main(String[] args) {
        int num = 1210;
        int temp = num;
        int sum = 0;
        while(num>0){
            int last = num%10;
            sum = sum * 10+ last;
            num = num / 10;
        }
        System.out.println(sum==temp);
    }
}
