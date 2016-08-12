/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leapyear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if((a%400==0) || (a%4==0) && (a%100!=0))
		{
			
			System.out.println("its a Leap year");
		}
		else
		{
			System.out.println("its not a Leap year");
			
		}
	}
}
