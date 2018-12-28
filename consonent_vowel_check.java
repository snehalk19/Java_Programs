/*  
Problem Statement
You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.
•	If vowel count > consonant count then print - “Yes”(without quotes).
•	If vowel count < consonant count then print - “No”(without quotes).
•	If vowel count = consonant count then print - “Same”(without quotes).

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
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  String s=sc.nextLine();
    	  Geeks obj=new Geeks();
    	  obj.checkString(s);
    	   
    	 }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        int len = s.length()-1;
        for(int i = 0 ; i<len;i++)
        {
            char val = s.charAt(i);
            if(val == ' ')
                continue;
            else if(val == 'a' || val == 'e'|| val == 'i'|| val == 'o'|| val == 'u')
                v++;
            else
                c++;
        }
        
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
//Position this line where user code will be pasted.
