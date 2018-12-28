/*  
Problem Statement
Here, we will learn to manipulate the basic data types in Java. You will be given four different variables of different data types: a (int), b (float), c (double), l (long), d (byte). Your task is to do step-wise operations as given below:
1. Divide c by b.
2. Divide b by a.
3. Divide c by a.
4. Add result at step 3 with l.
5. Divide a by d.*/

/Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class GFG {
    // Driver code
	public static void main (String[] args) {
	    
	    // Input using Scanner class
	    Scanner sc = new Scanner(System.in);
		int a;
		float b;
		double c;
		long l;
		byte d;
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    a = sc.nextInt();
		    b = sc.nextFloat();
		    c = sc.nextDouble();
		    l = sc.nextLong();
		    d = sc.nextByte();
		    
		    Geeks g = new Geeks();
		    g.dataTypes(a, b, c, l, d);
		}
	}
}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d){
        
        double p = c/b;	//c/b
        double q = b/a;	//b/a
        double r = c/a;	//c/a
        double m = r+l;	//r+l
        int s = a/d;//a/d
        
        
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        }}
  

