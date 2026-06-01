import java.util.Scanner;
class vowels
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
String vow = "";
int count = 0;
for(int i = 0; i < str.length(); i++)
{
char ch = str.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
{
vow += ch;
count++;
}
}
System.out.println("Number of vowels: " + count);
System.out.println("The vowels are: "+ vow);
}
}