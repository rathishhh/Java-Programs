class large
{
public static void main(String[] args)
{
int[] arr = {10,20,5,40,30};
int lar = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
for( int n : arr){
if(n>lar){
second = lar;
lar = n;
}
else if(n> second && n != lar){
second = n;
}
}
System.out.println("Second Largest "+ second);
}
}