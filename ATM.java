package TCS_code;
import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        System.out.print("Enter the ATM pin:");
        int check = sc.nextInt();
        int amt = 10000;
        if(pin!=check){
            System.out.println("Incorrect pin");
            return;
        }
        System.out.println("Welcome");
        System.out.println("1.Check Balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        while(true){
            System.out.print("Enter your choice (1/2/3/4):");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Your Current balance is:"+amt);
                    break;
                case 2:
                    System.out.print("Enter your withdraw amount:");
                    int withdraw = sc.nextInt();
                    if(withdraw>amt){
                        System.out.println("Insufficient Balance");
                    }else if(withdraw % 100 != 0){
                        System.out.println("Give valid amount in hundreds");
                    }
                    else{
                        amt = amt-withdraw;
                        System.out.println("Withdraw successful");
                    }
                    break;
                case 3:
                    System.out.print("Enter your Deposit amount:");
                    int depo = sc.nextInt();
                    System.out.println("Deposit successfull");
                    amt = amt +depo;
                    break;
                case 4:
                    System.out.println("Thank You");
                    return;
                    
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
