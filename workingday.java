/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class workingday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      switch(a)
      {
      	case "sunday":
      		System.out.println("false");
      		break;
      	/*case "saturday":
      		System.out.println("false");
      		break;*/
      	default:
      	System.out.println("true");
      	break;
      	
      }
      
	}
}
