import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class compareobject
{
	String s1;
	
	public compareobject(String a1)
	{
		s1=a1;
	}
	
	public boolean equals(Object obj2)
	{
	if(s1==obj2)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	
	public boolean equal2(Object obj2)
	{
		
		if(s1.equals(obj2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		compareobject obj1=new compareobject("abcd");
		Ideone obj2=new compareobject("abc");
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equal2(obj2));
		
		
	}
}
