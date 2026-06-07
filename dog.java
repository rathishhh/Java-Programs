class animal
{
void eat()
{
System.out.println("Animal is eating");
}
}
class mammel extends animal
{
void mam()
{
System.out.println("Mammel");
}
}
class dog extends mammel
{
void bark()
{
System.out.println("Barking");
}
public static void main(String[] args)
{
dog d = new dog();
d.eat();
d.mam();
d.bark();
}
}