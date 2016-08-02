/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rem,rev=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number\n");
	int n=s.nextInt();
	int a=n;
	while(a>0)
	{
		rem=a%10;
		a=a/10;
		rev=rev*10+rem;
		
		
	}// your code goes here
	if(rev==n)
	{
		System.out.println("the number is palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
	
}
