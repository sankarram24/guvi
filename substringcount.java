/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class substringcount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str = "helloslkhellodjladfjhello";
String findStr = "hello";
int lastIndex = 0;
int count = 0;

while (lastIndex != -1) {

    lastIndex = str.indexOf(findStr, lastIndex);

    if (lastIndex != -1) {
        count++;
        lastIndex += findStr.length();
    }
}
System.out.println(count);
	}
}
