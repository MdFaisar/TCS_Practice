package TCS_code;

public class Perfectnum {
    public static void main(String[] args) {
        int num = 8;
        int sum = 1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        System.out.println(sum==num);
    }
}
