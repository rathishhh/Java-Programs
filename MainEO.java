import java.util.*;

public class MainEO
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < n; i++)
        {
            long arr = sc.nextLong();

            if(i % 2 == 0)
                evenSum += arr;
            else
                oddSum += arr;
        }

        System.out.println(evenSum - oddSum);
    }
}