import java.util.Scanner;
class square {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the ending number: ");
int num = sc.nextInt();
System.out.println("\nSquare Series");

for(int i=1; i<=num; i++){
System.out.println(i*i);
}
}
}
