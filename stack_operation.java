/*
Problem Statement
Given a stack of integers and Q queries. The task is to perform operation on stack according to the query.
nput Format:
First line of input contains nubmer of testcases T. For each testcase, first line of input contains Q, number of queries. Next line contains Q queries seperated by space. Queries are as:

i x : (adds element x in the stack).

r : (returns and removes the topmost element from the stack).

h : Prints the topmost element.

f y : (check if the element y is present or not in the stack). Print "Yes" if present, else "No".
*/

{
//Initial Template for Java
import java.util.*;
//Position this line where user code will be pasted.
// Driver class with Driver code
class GFG 
{
	// Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    // Declaring stack of integers
		    Stack <Integer> st = new Stack<Integer>();
		    
		    int q = sc.nextInt();
		    
		    // Working with queries
		    while(q-- > 0)
		    {
		        char ch = sc.next().charAt(0);
		        Geeks obj = new Geeks();
		       if(ch == 'i')
		      {
		         int x = sc.nextInt();
		         obj.insert(st, x);
		      }
		    
		      if(ch == 'r')
		      {
		          obj.remove(st);
		      }
		      
		      if(ch == 'h')
		      {
		          obj.headOf_Stack(st);
		      }
		      if(ch == 'f')
		      {
		          int x = sc.nextInt();
		          obj.find(st, x);
		      }
		      
		      
		    }
		    // System.out.println();
		 }
	}
}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Helper class to implement functions
// insert : to insert element to stack
// remove : to pop element from stack
// headOf_Stack : to return top of stack
// find : to find the element in stack
class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
    }
    
    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();// Your code here
        
    }
    
    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();// Your code here
        System.out.println(x + " ");
    }
    
    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {
    
        if(st.search(val)!= -1)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
