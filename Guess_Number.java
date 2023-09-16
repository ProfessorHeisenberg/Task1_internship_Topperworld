import java.util.Random;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Guess_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int n = rn.nextInt(100);
        int count = 0;
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You Have Maximum 5 Attempts Limit");
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("Enter the Number You Guessed between 1 to 100 = ");
            int guessno = sc.nextInt();
            if (guessno > n)
            {
                System.out.println("Number That You Have Guessed is Greater than Number That is Generated");
            }
            else
            {
                if (guessno >= n)
                {
                    System.out.println("Number the you have Guess is correct");
                    break;
                }

                System.out.println("Number That You Have Guessed is Smaller than Number That is Generated");
            }
            ++count;
        }
        if (count == 5)
        {
            System.out.println("OOPS !! Your Chances Are Exhusted");
            System.out.println("Random Number is = " + n);
        }

    }
}