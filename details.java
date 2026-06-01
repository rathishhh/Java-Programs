import java.util.Scanner;
class details
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Name");
String name = sc.next();
System.out.println("Enter your Age");
int num = sc.nextInt();
System.out.println("Enter your Organization");
String organiz = sc.next();
System.out.println("Name :"+name);
System.out.println("Age :"+num);
System.out.println("Organization :"+organiz);
}
}