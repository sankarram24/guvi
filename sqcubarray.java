import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sqcubarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int sum=0,sq,cub;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sq=a[i];
				
				sum=sum+sq*sq;
			}
			else
			{
				cub=a[i];
				sum=sum+cub*cub*cub;
			}
		}
		System.out.println(sum);
	}
}
