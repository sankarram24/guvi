import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int fact=1;
		Scanner s=new Scanner(System.in);// your code goes here
		System.out.println("Enter the number");
		int a=s.nextInt();
		for(int i=a;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
