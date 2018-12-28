/*  
Problem Statement
You are given a string s of x and y. You need to verify whether the string follows the patternxnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.
*/

{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   String s=sc.next();
    	   Geeks obj=new Geeks();
    	   obj.follPatt(s);
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    static void follPatt(String s)
    {
        Stack<String> stack = new Stack<String>();
        
        int len = s.length();
        int status = 1;
        for(int i=0 ;i<len ;i++)
        {
            if(s.charAt(i)=='x')
            {
                stack.push("x");
               // System.out.println("Pushed x");
            }
            else if(!stack.empty() && s.charAt(i)=='y')
            {
                stack.pop();
            }
            else if(stack.empty() && s.charAt(i)=='y')
            {
                status=0;
            }
            
        }
        if(!stack.empty())
        {
            status = 0;
        }
        if(status==1)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        
    }
}
