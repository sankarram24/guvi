/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class addless
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int a=Integer.parseInt(n.readLine());
		int add=0,b;
		b=a;
		while(b>0)
		{
			
			add=add+b;
			b--;
		}
		System.out.println(add);
	}
}
