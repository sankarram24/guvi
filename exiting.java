/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class exiting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch=='q' || ch=='Q')
		{
			System.exit(0);
		}
	}
