/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hcf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int min,hcf=0,max,t;
		if(a>b){
		min=b;max=a;}
	//	System.out.println(min);}
		else{
		min=a;max=b;}
	//	System.out.println(min);}
		
	/*	for(int i=min;i>0;i--)
		{
			
			if((a%i==0) && (b%i==0))
			{
				
				hcf=i;
			}
		}*/
		int rem=1;
		while(rem>0)
		{
			rem=max%min;
			
			if(rem==0)
			{hcf=min;}
			
			else{
				
				t=rem;
				max=min;
				min=t;
			}
			
			
		}
		
		System.out.println(hcf);
	}
}
