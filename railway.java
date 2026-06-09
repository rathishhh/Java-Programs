import java.util.*;
class railway
{
public static void main(String[] args)
{
int availableseats = 5;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter seats required: ");
int req = sc.nextInt();
if(req > availableseats)
{
throw new Exception("Not enough seats available");
}
availableseats -= req;
System.out.println("Booking Confirmed");
System.out.println("Remaining Seats: " + availableseats);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("Thank you for using Railway Booking");
}
}
}