/*
Problem Statement
Here we will learn logical operators like AND(&&), OR(||), NOT(!). These operators produce either a true or a false as an output.*/

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
		    boolean a = sc.nextBoolean();
		    boolean b = sc.nextBoolean();
		    
		    Geeks g = new Geeks();
		    g.logicOp(a, b);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.print(a&&b);
        System.out.print(" ");
        System.out.print(a||b);
        System.out.print(" ");
        System.out.println((!a)&&(!b));
        
    }
}
