package TCS_code;

public class Numlen {
    public static void main(String[] args) {
        int num = 1234;
        int len = 0;
        while(num!=0){
            num = num / 10;
            len++;
        }
        System.out.println(len);
    }
}
