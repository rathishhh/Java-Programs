import java.util.HashSet;
import java.util.Scanner;
public class emp
{
public static void main(String[] args)
{
HashSet<Integer> id = new HashSet<>();
id.add(101);
id.add(102);
id.add(103);
id.add(104);
Scanner sc = new Scanner(System.in);
int empid = sc.nextInt();
if(id.contains(empid))
{
System.out.println("Employee found");
}else{
System.out.println("Employee Not found");
}
}
}