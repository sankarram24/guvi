import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class multitable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);// your code goes here
		System.out.println("Enter the number ");
		int a=s.nextInt();
		int b;
		for(int i=1;i<=10;i++)
		{
			b=i*a;
			System.out.println(i+ "*" +a );
			System.out.println(" =" +b);
		}
	}
}
