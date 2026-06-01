import java.util.Scanner;
class traffic
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Traffic light colour(Red/Yellow/Green): ");
String light = sc.next();

switch(light){

case "Red":
System.out.println("Stop");
break;

case "Yellow":
System.out.println("Wait");
break;

case "Green":
System.out.println("Go");
break;

default:
System.out.println("Invalid String");
}
}
}