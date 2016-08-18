/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cubesquarearray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] d=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			d[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			if(d[i]%2==0)
			{
				sum=sum+d[i]*d[i];
				
			}
			else
			{
				sum=sum+d[i]*d[i]*d[i];
			}
		}
		System.out.println(sum);
	}
}
