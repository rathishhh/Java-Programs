import java.util.ArrayList;
class ArrayListDemo
{
public static void main(String[] args)
{
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.remove("Apple");
System.out.println(fruits);
}
}