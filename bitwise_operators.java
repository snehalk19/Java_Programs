/*
Problem Statement
Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. e = ~e */


{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    Geeks g = new Geeks();
		    g.bitWiseOp(a, b, c);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Function to perform bitwise manipulations
// a, b and c are input integers
class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        // Your code here
        int d = a ^ a;
          System.out.println(d);
        int e = c ^ b;
         System.out.println(e);
        int f = a & b;
        System.out.println(f);
        int g = c | (a ^ a);
           System.out.println(g);
         e = ~e;
         
       
        
         
      
         System.out.println(e);
    }
}
