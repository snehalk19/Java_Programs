/*
Problem Statement
Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.
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
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   Geeks obj=new Geeks();
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{
        static int coutChars(String str1, String str2)
    {  
        int count1[] = new int[26]; 
int count2[] = new int[26]; 

for (int i = 0; i < str1.length() ; i++) 
count1[str1.charAt(i) -'a']++; 
for (int i = 0; i < str2.length() ; i++) 
count2[str2.charAt(i) -'a']++; 

int result = 0; 
for (int i = 0; i < 26; i++) 
result += Math.abs(count1[i] - 
count2[i]); 
return result; 
        
         }

}
