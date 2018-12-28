/*
Problem Statement
Given two integers A and B. Your task is to print the even number first and odd number next in individual lines.*/

{
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		Geeks obj=new Geeks();
    		obj.evenOdd(a,b);
		}
		
	
		
	}
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Function to check if number is even or odd
class Geeks {
    // 
	 static void evenOdd (int a,int b) 
	 {
		//Your code here
	     if(a%2 == 0)
	     {
	     System.out.println(a);
	     System.out.println(b);
	     }
	     else
	     {
	         System.out.println(b);
	         System.out.println(a);
	     }
	 }
}
