import java.util.Scanner;
class Binary
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.next();

for(int i = 0; i < str.length(); i++)
{
if(str.charAt(i) == '1')
System.out.print("A");
else
System.out.print("B");
}
}
}