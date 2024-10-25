// Print All Palindromic Substrings

import java.io.*;
import java.util.*;

public class Main {
    // abb yeah check kare ga ki palindrome ha ki nhi
    public static boolean IsPalindrome(String s){
        // i lo rakhna ha starting mai or j last mai or i==j agar huya or aga bharde or sab sahi raha to palindrome ha
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            char chr1 = s.charAt(i);
            char chr2 = s.charAt(j);

            if(chr1 != chr2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void solution(String s){
        for(int i = 0; i < s.length(); i++){       // i sa leka j tak jana ha 
            for(int j = i + 1; j <= s.length(); j++){  // i=j is liya ha kyuki j  i sa start hona chiya or j tak chlna ha 
                String ss = s.substring(i,j);// substring li sabki
                if(IsPalindrome(ss) == true){   // or hrr characher ko check kiya condition ka hisab sa
                    System.out.println(ss);   // or jo sahi ha ussa pass kar diya 
                }
            }
        }
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

/*Time Complexity :

Why O(n^3) Time?

We are running the outer loop from 0 to n-1 which takes O(n) and the inner loop from i to n-1, which will again take O(n).

Now, we are generating a substring from i to j, and checking whether it is a palindrome also takes O(j-i) = O(n) time.

Hence, the overall time complexity turns out to be O(n * n * n) = O(n^3) time.

SPACE COMPLEXITY :

O(n) auxiliary space is required as we are passing the substring from i to j to isPalindrome function.*/