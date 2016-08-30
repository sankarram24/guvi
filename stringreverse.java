import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stringreverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		
		char[] ar=new char[a.length()];
		
		for(int i=0;i<a.length();i++)
		{
			ar[i]=a.charAt(i);
		}
		
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(ar[i]);
		}
			
		
	}
}
