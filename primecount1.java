/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class primecount1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int flag=0,count=0;
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				flag=0;
				if(i%j==0)
				{
					flag=1;
					break;
				}
			//	System.out.println(i);
			/*	else
				{
					flag=0;
				} */
			}
			
				if(flag==0)
		         {
			count++;
	          	}
		}
	
		System.out.println(count);
		//	System.out.println(count);
	}
}
