/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class splchcount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		String a=s.nextLine();
		char ch;
		int spl=0;
		for(int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			if(Character.isLetter(ch))
		      
		      {}
		      else if(Character.isDigit(ch))
			 
			 {}
			  else if(ch==' ')
			  {}
			  
			  else
			  {
			  	spl++;
			  }
			  
		}
		System.out.println(spl);
	}
}
