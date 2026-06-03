import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0)
        {
            int hardness = sc.nextInt();
            double carbon = sc.nextDouble();
            int tensile = sc.nextInt();

            boolean c1 = hardness > 50;
            boolean c2 = carbon < 0.7;
            boolean c3 = tensile > 5600;

            if(c1 && c2 && c3)
                System.out.println(10);

            else if(c1 && c2)
                System.out.println(9);

            else if(c2 && c3)
                System.out.println(8);

            else if(c1 && c3)
                System.out.println(7);

            else if(c1 || c2 || c3)
                System.out.println(6);

            else
                System.out.println(5);
        }
    }
}