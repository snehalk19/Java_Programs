/*  
Problem Statement
Given an array A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.
*/

{
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;
//Position this line where user code will be pasted.
// Driver class
class GFG {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks obj = new Geeks();
		    obj.countSpecials(a, sizeof_array, k);
		}
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Class Geeks with countSpecials as its member function
* a : input array
* n : size of array
k : to calculate floor(n/k)
*/
class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        
             int max=0;
        	for(int i=0;i<n;i++) 
        	{
        	    if(a[i]>max)max=a[i];
        	    
        	}
             int[] freq=new int[max+1];
             int count=0;
             for(int i=0;i<n;i++)
             {
                 //System.out.println("Freq before:" + freq[a[i]]);
                 freq[a[i]-0]++;
                //System.out.println("Freq after:" + freq[a[i]]);
             }
             for(int i=0;i<n;i++)
             {
                 if(freq[a[i]-0]!=0)
                 {
                   if(f==freq[a[i]-0])  
                   {
                       count++;
                   }
                   freq[a[i]-0]=0;
                 }
                 
             }
             System.out.println(count); 
    }
}
