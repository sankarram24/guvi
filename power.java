/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);	// your code goes here
	System.out.println("enter the number and its power\n");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println(Math.pow(a,b));
	}
}
