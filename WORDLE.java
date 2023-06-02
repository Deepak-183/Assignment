/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Wordle
{	public static void main (String[] args) throws java.lang.Exception
	{	    	
		Scanner s = new Scanner(System.in);
	  	int t = s.nextInt();
	  	while(t-->0)
		{
	   		String S = s.next();
			String R = s.next();
			String m[]=new String[5];
			for(int i=0;i<5;i++){
				if(S.charAt(i)==(R.charAt(i))) 
					m[i]="G";
				else 
					m[i]="B";
					System.out.print(m[i]);
			}
			System.out.print("\n");
		}   
	  }
}
