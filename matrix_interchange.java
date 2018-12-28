/*  
Problem Statement
You are given a matrix M or r rows and c columns. You need to swap the first column with the last column.
*/

{
//Initial Template for Java
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int rows = sc.nextInt();
            int cols = sc.nextInt();
		    int a[][] = new int[rows][cols];
		    
		    for(int i = 0;i<rows;i++){
		        for(int j = 0;j<cols;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    Geeks obj = new Geeks();
		    obj.interchange(a, rows, cols);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Class Geeks with its member function interchange()
* a[][] = matrix input
* r : number of rows
* c : number of columns
*/
class Geeks{
    
    static void interchange(int a[][],int r, int c){
        
        // Your code here
        
        for(int i = 0; i<r ;i++ )
        {
            for(int j =0 ; j<c ; j++)
            {
                if(j==c-1)
                {
                int temp = a[i][j];
                a[i][j] = a[i][0];
                a[i][0] =temp;
                }
                
            }
            
        }
        
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
