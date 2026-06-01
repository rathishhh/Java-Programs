import java.util.Scanner;

class assignment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        a += b;
        System.out.println("After += : " + a);

        a -= b;
        System.out.println("After -= : " + a);

        a *= b;
        System.out.println("After *= : " + a);

        a /= b;
        System.out.println("After /= : " + a);

        a %= b;
        System.out.println("After %= : " + a);
    }
}