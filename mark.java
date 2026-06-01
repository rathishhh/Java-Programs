import java.util.Scanner;
class mark{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Age: ");
int age = sc.nextInt();
System.out.println("Enter Mark: ");
int mark = sc.nextInt();

System.out.println((age>=18) && (mark>50));
}
}