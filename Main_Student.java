import java.util.*;
class student
{
int id;
String name;
student(int id, String name)
{
this.id = id;
this.name = name;
}
}
class Main_Student
{
public static void main(String[] args)
{
ArrayList<student> students = new ArrayList<>();
students.add(new student(101,"Raxx"));
students.add(new student(102,"Shaxx"));
for(student s : students)
{
System.out.println(s.id+" "+s.name);
}
}
}