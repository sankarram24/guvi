/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number\n");// your code goes here
		int g=s.nextInt();
		System.out.println(a+"\n"+b);
		for(int i=1;i<=g;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(""+c);
			
		}
	}
}
