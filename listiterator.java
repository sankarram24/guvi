/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class listiterator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		List<Integer> li=new ArrayList<Integer>();
		ListIterator<Integer> liitr=null;
		for(int i=1;i<6;i++)
		{
		li.add(i);
	/*	li.add(2);
		li.add(3);
		li.add(4);
		li.add*/
	}
	liitr=li.listIterator();
	while(liitr.hasNext())
	{
		System.out.println(liitr.next());
	}
	while(liitr.hasPrevious())
	{
		System.out.println(liitr.previous());
	}
}}
