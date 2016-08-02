* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number\n");
		int a=read.nextInt();
		if(a==0)
		{
			System.out.println("the number is zero");
		}
		if(a>0)
		{
			System.out.println("the number is positive");
		}
		else
		{
			System.out.println("the number is negative");
		}
		// your code goes here
	}
}
