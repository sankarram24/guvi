import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class checkfirstchar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		
		String a=s.nextLine();
		
		char ch=a.charAt(0);
		boolean b=Character.isLetter(ch);
		if(b)
		{
			
			System.out.println("its a character");
		}
		else
		{
			System.out.println("its not a char");
		}
			
			
			
		
	}
}
