import java.util.Scanner;
public class arithmetic
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number :");
int a = sc.nextInt();
System.out.println("Enter Second number :");

int b = sc.nextInt();
System.out.println("Enter Third number :");
int c = sc.nextInt();
int add = a+b;

int sub = a-b;

int mul = a*b;

int div = a/b;
int avg = (a+b+c)/3;

System.out.println("Addition "+add);
System.out.println("Subraction "+sub);
System.out.println("Multiplication "+mul);
System.out.println("Division "+div);
System.out.println("Avg of 3 numbers "+avg);
}
}

