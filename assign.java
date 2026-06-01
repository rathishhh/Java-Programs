import java.util.Scanner;

class assign
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        a += 5;
        System.out.println("After += : " + a);

        a -= 5;
        System.out.println("After -= : " + a);

        a *= 5;
        System.out.println("After *= : " + a);

        a /= 5;
        System.out.println("After /= : " + a);

        a %= 5;
        System.out.println("After %= : " + a);
    }
}