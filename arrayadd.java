/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrayadd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		int len1=s.nextInt();
		int len2=s.nextInt();
		int[] a=new int[len1];
		int[] b=new int[len2];
		
		if(len1==len2)
		{
			
			for(int i=0;i<len1;i++)
			{
				a[i]=s.nextInt();
			}
			for(int i=0;i<len2;i++)
			{
				b[i]=s.nextInt();
			}
			
			
			for(int i=0;i<len1;i++)
			{
				
				a[i]=a[i]+b[i];
			}
		}
		
		for(int i=0;i<len1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
