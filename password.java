import java.util.Scanner;
class password
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String username = sc.nextLine();
System.out.println("Enter the username: ");
String password = sc.nextLine();
System.out.println("Enter the password: ");

if((username == "rathishms") && (password == "rathish@2005"))
{
System.out.println("Correct username and password");
}
else
{
System.out.println("Invalid username or password");
}
}
}