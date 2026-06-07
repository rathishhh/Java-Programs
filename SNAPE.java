import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- >0)
		{
		    int B = sc.nextInt();
		    int LS = sc.nextInt();
		    
		    double min = Math.sqrt(LS*LS - B*B);
		    double max = Math.sqrt(LS*LS + B*B);
		    
		    System.out.println(min+" "+max);
		}

	}
}
