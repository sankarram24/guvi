/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alphadigitcount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");// your code goes here
		String b=st.readLine();
		int len=b.length();char ch;
		int al=0,di=0,sp=0,spl=0;
		for(int i=0;i<len;i++)
		{
			ch=b.charAt((i));
			if(Character.isLetter(ch))
			{
				al++;
			}
			else if(Character.isDigit(ch))
			{
				di++;
			}
			else if(ch==' ')
			{
				sp++;
			}
			else
			{
				spl++;
			}}
			System.out.println("alpha="+al);
			System.out.println("digit="+di);
			System.out.println("space="+sp);
			System.out.println("special="+spl);
		
			
		
	}
}
