/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class asciiii
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String ch;
        int i;
        for(i=1; i<=255; i++)
        {
            ch = new Character((char)i).toString();
            System.out.print(i+ " -> " + ch + "\t");
        }// your code goes here
	}
}
