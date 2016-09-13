/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rotatearray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
	//	System.out.println(a);
		int[] ar=new int[a];
		int b=s.nextInt();
		for(int i=0;i<a;i++)
		{
			ar[i]=s.nextInt();
		}
		
	/*	for(int i=0;i<a;i++)
		{
			System.out.println(ar[i]);
		}*/
		int t=a-b;
		int[] c=new int[a];
		int j=0;
		for(int i=t;i<a;i++)
		{
			c[j]=ar[i];
			j++;
		}
		
		for(int i=0;i<t;i++)
		{
			c[j]=ar[i];
			j++;
		}
		
		for(int i=0;i<a;i++)
		{
			System.out.println(c[i]);
		}
		
	}
}
