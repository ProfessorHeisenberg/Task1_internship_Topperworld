import java.util.Scanner;
public class ATM_System
{
    public static void main(String[]args)
    {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("ATM MACHINE");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Checking Balance");
        System.out.println("Choose 4 for exit");
        System.out.println("Choose the operation : ");
        int n = sc.nextInt();
        for(int i = 0;i<=1;i++)
        {
            switch (n)
            {
                case 1:
                    System.out.println("Enter the Amount to Withdraw");
                    int withdraw = sc.nextInt();
                    if (balance <= withdraw) {
                        System.out.println("entered amount can't be Withdrawn");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Your Money has been Withdrawn Successfully");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been Deposited Successfully");
                    break;
                case 3:
                    int check_balance = balance;
                    System.out.println("Current balance in the account is = " + check_balance);
                case 4:
                    break;
                default:
                    System.out.println("Enter the proper choice");
            }
        }
    }
}
