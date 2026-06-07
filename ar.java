import java.util.*;
class ar
{
public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
String[] arr = list.toArray(new String[0]);
for(String s : arr)
{
System.out.println(s);
}
}
}