import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strncmp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		
		int len1,len2;
	//	len1=a.length();
	//	len2=b.length();
		
		int i=0,flag=0;
		char ch1,ch2;
		
		while(a.charAt(i)!='\0' && b.charAt(i)!='\0')
		{
			
		//	ch1=a.charAt(i);ch2=b.charAt(i);
			
			if(a.charAt(i)!=b.charAt(i))
			{
				
				flag++;
			}
			i++;
			
		}
		if(flag==0)
		{
			System.out.println("the strings are equal");
		}
		else
		{
			System.out.println("the strings are not equal");
		}
	}
}
