import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strncat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		
		int len1=a.length();
		int len2=b.length();
		char[] ch1=new [len1];
		char[] ch2=new [len2];
		for(int i=0;i<len1;i++)
		{
			
			ch1[i]=a.toCharArray(i);
			
			ch2[i]=b.toCharArray(i);
		}
		int len3=len1+len2;
		for(int i=len1;i<len3;i++)
		{
			ch1[i]=ch2[i];
		}
		
		String c=new String(ch1);
		
		System.out.println(c);
	}
}
