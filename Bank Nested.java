import java.util.*;

public class bank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int balance = 500;

        try
        {
            System.out.println("Bank System Started");

            try
            {
                System.out.println("Enter deposit: ");
                int deposit = sc.nextInt();

                if(deposit < 1000)
                {
                    throw new Exception("Minimum deposit required is 1000");
                }

                balance += deposit;
                System.out.println("Deposit Successful");
            }
            catch(Exception e)
            {
                System.out.println("Inner Catch: " + e.getMessage());
            }

            try
            {
                System.out.println("Enter withdrawal: ");
                int withdrawal = sc.nextInt();

                if(withdrawal > balance)
                {
                    throw new Exception("Insufficient Balance");
                }

                balance -= withdrawal;
                System.out.println("Withdrawal Successful");
            }
            catch(Exception e)
            {
                System.out.println("Inner Catch: " + e.getMessage());
            }

            System.out.println("Final Balance: " + balance);
        }
        catch(Exception e)
        {
            System.out.println("Outer Catch: " + e.getMessage());
        }
    }
}