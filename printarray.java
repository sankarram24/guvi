/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class printarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n,k;
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		
			k=s.nextInt();
		for(int i=0;i<n;i++)
		{
			
			a[i]=s.nextInt();
		}
		int x=0;
		for(int i=n-k;i<n;i++)
		{
			b[x]=a[i];
			x++;
		}
	
		for(int i=0;i<n-k;i++)
		{
			b[x]=a[i];
			x++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}
