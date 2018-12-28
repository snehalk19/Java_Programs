/*
Problem Statement
You are given an array A of size N. You need to do the following:
1.	You need to xor the elements of the arrays with their respective indices(index starting from 0).
2.	After step1, print the array.
3.	Now, set all the elements of A to zero.
4.	Now, print A.
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
    	     int n=sc.nextInt();
    	     int arr[]=new int[n];
    	     for(int i=0;i<n;i++)
    	     arr[i]=sc.nextInt();
    	     
    	     
    	        Geeks obj=new Geeks();
            	obj.xor1ToN(arr,n);
        	    obj.printArr(arr,n);
        	    obj.setToZero(arr,n);
        	    obj.printArr(arr,n);
    	   
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
    
    static void printArr(int arr[],int n)
    {
        //Your code for printing arr here
        for(int i=0; i<n ;i++)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    
   static void setToZero(int arr[],int n)
    {
        //use Arrays.fill to set arr to zero
        Arrays.fill(arr,0);
    }
    
   static void xor1ToN(int arr[], int n)
    {
        
        for(int i=0; i<n ;i++)
        {
            arr[i] = arr[i]^i;
        }
           //Xor arr[i]^i
        
    }
}
