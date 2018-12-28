/*  
Problem Statement
We will use while loop and print a number n's table in reverse order.
For each testcase, print n*10, n*9....n*1.
*/
{
//Initial Template for Java
//Initial Template for C++
//Initial Template for C++
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n =sc.nextInt();
		    Geeks obj=new Geeks();
		    obj.printTable(n);
		}
	
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                 System.out.print(n*multiplier + " ");
                 multiplier--;
            }
       System.out.println();
	 }
}
