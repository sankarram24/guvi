/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class revnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem,rev=0;
		int num1=num;
		while(num1>0)
		{
			rem=num1%10;
			
			rev=rem+rev*10;
			num1=num1/10;
			
		}
		System.out.println(rev);
	}
}
