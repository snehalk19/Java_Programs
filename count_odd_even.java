/*
Problem Statement
Given an array A of N elements. The task is to count number of even and odd elements in the array.
  */
{
//Initial Template for Java
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks obj = new Geeks();
		    obj.countOddEven(a, sizeof_array);
		}
		
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Class Geeks with countOddEven() as its member function
* a : input array
* n : size of array
*/
class Geeks{
    static void countOddEven(int a[], int n){
        
        // Your code here
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println(odd+" "+even);
        
    }
}
