/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraynonrepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
	//	Scanner b=new Scanner(System.in);
		//int a=s.nextInt();
	//	System.out.println(a);
	int n=s.nextInt();
	int[] ar=new int[n];
	int count=0;
	for(int i=0;i<n;i++)
	{
		ar[i]=s.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		count=0;
		for(int j=0;j<n;j++)
		{
			if(ar[j]==ar[i])
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(ar[i]);
		}
	}
	
	}
}
