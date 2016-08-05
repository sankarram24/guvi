/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class countchar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=s.nextLine();
		int ln=a.length();
		int let=0;
		char ch;
		for(int i=0;i<ln;i++)
		{
			ch=a.charAt(i);
			if(Character.isLetter(ch))
			{
				
				let++;
			}
		}
		
		System.out.println(let);
	}
}
