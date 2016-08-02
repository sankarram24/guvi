/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int f=0;
		Scanner s=new Scanner(System.in);// your code goes here
		System.out.println("Enter the number\n");
		int n=s.nextInt();
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				f=1;
			}
			
		}
		if(f==1)
		{
			System.out.println("It is not a prime");
		}
		else
		{
			System.out.println("It is a prime");
		}
	}
}
