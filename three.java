class three
{
public static void main(String[] args)
{
int result = 10/0;
}
catch(ArithmeticException e)
{
System.out.println("Exception handling");
} Finally {
System.out.println("Final block Executed");
}
}