import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class revnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to find the reverse\n");
		int a=Integer.parseInt(n.readLine());
		
		int rem,rev=0;
		while(a>0)
		{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		System.out.println(rev);
	}
}
