import java.util.*;
class iterate
{
public static void main(String[] args)
{
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(40);
list.add(30);
Iterator<Integer>itr = list.iterator();
while(itr.hasNext())
{
int num = itr.next();
if(num == 20)
{
itr.remove();
}
}
System.out.println();
}
}
