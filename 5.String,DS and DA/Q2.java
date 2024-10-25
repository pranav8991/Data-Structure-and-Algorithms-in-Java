//  String Compression

import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
        String ans = "";
        for( int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                //
            }else{
                ans += str.charAt(i);
            } 
        }
        ans += str.charAt(str.length()-1);

		return ans;
	}

	public static String compression2(String str){
		// write your code here
        String ans = "";
        int count = 1;
        for( int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
            ans += str.charAt(i);
            if(count>1){
                ans += count;
            }
            count = 1;
            } 
        }
        ans += str.charAt(str.length()-1);
        if(count>1){
            ans += count;
        }

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}

/*Time Complexity :

In both ways, we are traversing the input string once, hence the time complexity will be O(n).

SPACE COMPLEXITY :

If we take the space of the output string, then the solution is taking O(n) space. 
Although, if we ignore the space taken by the output, (which we generally do), the solution is said to take O(1) auxiliary space.*/