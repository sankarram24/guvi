/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number\n");
	int a=s.nextInt();
	for(int i=1;i<=a;i++)
	{
		sum=sum+i;
		
	}// your code goes here
	System.out.println("the sum of natural numbers is  "+sum);
	}
}
