/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digisum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the interger");
		int n=s.nextInt();
		
		while(n>0)
		{
			n=n/10;
			sum++;
		}// your code goes here
		System.out.println("sum is "+sum);
	}
}
