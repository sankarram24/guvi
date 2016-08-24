import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class constarray
{
	public char[] c=new char[5];
	
	constarray(char[] a)
	{
		c[5]=a[5];
	}
	char print()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(c[i]);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		char [] d=new char[5];
		for(int i=0;i<5;i++)
		{
			d[i]=s.nextChar();
		}
		constarray obj=new constarray(c[5]);
		obj.print();
	}
}
