class animals
{
void eat()
{
System.out.println("Animal is eating");
}
}
class dogs extends animal
{
void bark()
{
System.out.println("Barking");
}
public static void main(String[] args)
{
dog d = new dog();
d.eat();
d.bark();
}
}
