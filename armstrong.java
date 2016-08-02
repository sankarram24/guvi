/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int b,c=0;
		Scanner s=new Scanner(System.in);
		// your code goes here
		System.out.println("Enter the number\n");
		int d=s.nextInt();
		int a=d;
		while(a>0)
		{
			b=a%10;
			c=c+(b*b*b);
			
			a=a/10;
			
		}
		if(d==c)
		{
			System.out.println("its an armstrong no");
		}
		else
		{
			System.out.println("its not an armstrong");
		}
		
	}
}
