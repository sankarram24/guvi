/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class addinclusive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int add=0,add1=0;
	for(int i=1;i<=15;i++)
	{
		add=add+i;
	}
	System.out.println(add);
	for(int i=15;i<=45;i++)
	{
		if(i%2==0)
		{
		add1+=i;	
		}
	}
	System.out.println(add1);
	}
}
