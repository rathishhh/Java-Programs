import java.util.*;
class  fre
{
public static void main(String[] args)
{
ArrayList<Integer>list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(10);
list.add(30);
int freq = Collections.freq(list,10);
System.out.println("Frequency of 10="+freq);
}
}