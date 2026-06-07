import java.util.HashSet;
public class Hash
{
public static void main(String[] args)
{
int[] arr = {10,20,30,40,50};
HashSet<Integer>set = new HashSet<>();
for(int num : arr){
set.add(num);
}
System.out.println(set);
}
}