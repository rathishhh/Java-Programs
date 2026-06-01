import java.util.Scanner;
class vote
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Mark: ");
int mark = sc.nextInt();
if (mark>=40){
System.out.println("PASS");
}
else{
System.out.println("FAIL");
}
}
}