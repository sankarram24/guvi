/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class psng
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);// your code goes here
		System.out.println("Enter the number\n");
		int a=s.nextInt();
		if(a==0)
		{
			System.out.println("its zero");
		}
		if(a>0)
		{
			System.out.println("its a positive number");
		}
		else
		{
			System.out.println("its a negative number");
		}
	}
}
