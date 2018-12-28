/*
Problem Statement
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.
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
		    int n = sc.nextInt();
		    int a[][] = new int[n][n];
		    
		    for(int i = 0;i<n;i++){
		        for(int j = 0;j<n;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    Geeks obj = new Geeks();
		    System.out.println(obj.columnWithMaxZero(a, n));
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Class Geeks with its member function columnWithMaxZero()
* a[][] = matrix input
* n : number of rows and columns each
*/
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int col_cnt[] = new int[n];
        int val = -1 ;
        int index = 0;
        for(int i =0 ;i<n;i++)
        {
            int cnt_zero = 0;
            for(int j = 0 ; j<n ;j++)
            {
                if(a[j][i]==0)
                {
                    cnt_zero ++;
                }
                col_cnt[i] = cnt_zero;
                
            }
        }
        
        for(int i =0 ;i<n;i++)
        {
            if(val<col_cnt[i])
            {
                val = col_cnt[i];
                index = i;
            }
        }
        
        return index;   
        }
        
    }
