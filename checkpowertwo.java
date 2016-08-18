/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class checkpowertwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		boolean b=findpower(a);
		if(b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
	
	static boolean findpower(int c)
	{
		return ((c > 0) && ((c & (c - 1)) == 0));
		
	}
}
