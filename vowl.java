/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class vowl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		
		char x = a.next().charAt(0);
		System.out.print(x);
		if((x=='a'||x=='A') ||(x=='e'||x=='E') ||(x=='i'||x=='I') ||(x=='o'||x=='O') ||(x=='u'||x=='U'))
		{
		System.out.println("its vowels");
		}
		else
		{
			System.out.println("its consonants");
		}
	}
}
