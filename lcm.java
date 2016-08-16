import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lcm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int min,max;
		min=a<b?a:b;
		max=a>b?a:b;
		int x,lcm=0;
		
		//System.out.println(max);
	//	System.out.println(min);
		
		for(int i=1;i<=min;i++)
		{
			
			x=max*i;
			if(x%min==0)
			{
				lcm=x;
				
			}
		}
		System.out.println(lcm);
		
	}
}
