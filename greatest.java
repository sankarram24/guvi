/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class greatest
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b and c\n");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println("a is greater");
		
		
	}
	if(b>c)
	{
		System.out.println("b is greater");
		
	}
	else
	{
		System.out.println("c is greater");
	}

	// your code goes here
	}
}
