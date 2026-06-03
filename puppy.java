class animals
{
void eat()
{
System.out.println("Animal is eating");
}
}
class dogs extends animals
{
void bark()
{
System.out.println("Barking");
}
}
class puppy extends dogs
{
void pup()
{
System.out.println("Puppy");
}
public static void main(String[] args)
{
puppy p = new puppy();
p.eat();
p.bark();
p.pup();
}
}
