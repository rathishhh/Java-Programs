import java.util.Scanner;

class UserLogin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";

        System.out.print("Enter Password: ");
        String password = sc.next();

        try
        {
            if(!password.equals(correctPassword))
            {
                throw new Exception("Invalid Password");
            }

            System.out.println("Login Successful");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}