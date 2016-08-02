import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class addition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
		Scanner s=new Scanner(System.in);// your code goes here
		System.out.println("Enter the number\n");
		int b=s.nextInt();
		for(int i=1;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
