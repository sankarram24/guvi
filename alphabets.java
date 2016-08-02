/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character\n");
	char chr=s.next().charAt(0);
	if((chr>='a' && chr<='z') || (chr>='A' && chr<='Z'))
	{
		System.out.println("the character is an alphabet");
		
	}
	else
	{
		
		System.out.println("its not an alphabet");
	}
	
	// your code goes here
	}
}
