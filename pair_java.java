/*
Problem Statement

Given an array A of N pairs of integers. The task is to sort the array on the basis of first element.
*/

{
//Initial Template for Java
import java.io.*;
import java.util.*;
// Pair class
class Pair{
    int x;
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
//Position this line where user code will be pasted.
// Driver class with main function
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Pair arr[] = new Pair[N];
		    
		    for(int i = 0;i<N;i++){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        arr[i] = new Pair(x, y);
		    }
		    
		    custom_Compare obj = new custom_Compare();
		    
		    obj.sortPairs(arr, N);
		}
	}
}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Custom comparator class to sort the pairs
// on the basis of first element
class custom_Compare{
    
    static class Sortbyx implements Comparator<Pair>
    {
        public int compare(Pair a,Pair b)
        {
            return a.x - b.x;
        }
    }
    
    static void sortPairs(Pair arr[], int N){
        
        // Your code here
        
        Arrays.sort(arr,new Sortbyx());
        
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}