/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Todolist
{
	public static void main (String[] args) //throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int T= scn.nextInt();
		for(int i=0;i<T;i++){
		    
		    int N= scn.nextInt();
		    int A[] = new int[N];
		    
		   int count =0;
		    for (int j=0;j<N;j++){
		        A[j]=scn.nextInt();
		        if(A[j]>=1000){
		            count++;
		        }
		    }
		  	System.out.println(count);  
		}
	}
}
		   
		   
