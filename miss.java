public class miss
{
public static void main(String[] args)
{
int[] arr = {1,2,3,5};
int n =5;
int ex = n * (n+1)/2;
int ac = 0;
for(int num : arr){
ac += num;
}
int miss = ex - ac;
System.out.println("Missing matter "+miss);
}
}