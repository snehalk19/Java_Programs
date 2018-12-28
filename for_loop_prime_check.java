/* 
Problem Statement
Here, we will use for loop and check if the given number n is prime or not.
Note: A number is prime if it's divisible by itself and 1. Also, 1 is not prime.*/

{
//Initial Template for Java
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
		    obj.isPrime(n);
		}
	
		
	}
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
//Back-end complete function Template for Java
class Geeks {
    
	 static void isPrime (int n) 
	 {
	     boolean ip =true;
	        if(n==0 || n==1)
	            System.out.println("No");
	            
	       else 
	       {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i == 0)
                {
                ip=false;
                break;
                }
             }
	       if(ip==true)
            System.out.println("Yes");
            else 
            System.out.println("No");
         
	 }
}
}
