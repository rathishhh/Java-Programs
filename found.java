class found
{
public static void main(String[] args)
{
int[] arr={10,20,30,40,50};
int target = 30;
boolean found = false;

for(int n : arr)
{
if(n == target)
{
found = true;
break;
}
}
if(found)
{
System.out.println("FOUND");
}
else
{
System.out.println("NOT FOUND");
}
}
}