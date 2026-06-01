import java.util.Scanner;
class rel{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = sc.nextInt();
System.out.println("Enter Second number: ");
int b = sc.nextInt();

System.out.println("a>b: "+(a>b));
System.out.println("a<b: "+(a<b));
System.out.println("a==b: "+(a==b));
}
}