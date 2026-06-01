import java.util.Scanner;
class evenseries {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the Ending number: ");
int num = sc.nextInt();
int sum = 0;
for(int i=1; i<=num; i++){
int even = 2*i;
sum += even;
}
System.out.println("\nSum of EVEN SERIES: "+sum);
}
}