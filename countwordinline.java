import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class countwordinline
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s="";
int count=0;
 
Scanner in = new Scanner(System.in);
System.out.println("Please enter a String");
 s=in.nextLine();
 
char ch[]= new char[s.length()];    
 
for(int i=0;i<s.length();i++)
{
 
    ch[i]= s.charAt(i);
 
    if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
        count++;
 
}
System.out.println("Number of words in given String: "+count);
	}
}
