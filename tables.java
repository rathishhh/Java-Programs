
import java.util.Scanner;
class tables {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the Table you want: ");
int num = sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(i+"*"+num+"="+i*num);
}
}
}