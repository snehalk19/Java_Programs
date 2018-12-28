/* 
Problem Statement
Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which islargest.
*/
{
//Initial Template for Java
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
		    obj.isDivisibleByPrime(n);
		}
	
		
	}
}
//Position this line where user code will be pasted.
/*package whatever //do not write package name here */
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
//Back-end complete function Template for Java
class Geeks {
	 static void isDivisibleByPrime (int n) 
	 {
	     if(n%11 == 0)
	     System.out.println("Eleven");
	     else if(n%3 ==0 )
	     System.out.println("Three");
	     else if(n%2 == 0) 
	     System.out.println("Two");
	     else
	     System.out.println(-1);
             } }   
	
