import java.util.Scanner;
class even
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the starting number: ");
int a = sc.nextInt();
System.out.println("Enter the Ending number: ");
int b = sc.nextInt();

System.out.println("\nEven numbers");
for(int i=a;i<=b;i++){
if(i%2==0){
System.out.println(i);
}
}
System.out.println("\nOdd numbers");
for(int i=a;i<=b;i++){
if(i%2!=0){
System.out.println(i);
}
}
}
}




