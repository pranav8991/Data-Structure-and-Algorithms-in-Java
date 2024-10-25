//  String With Difference Of Every Two Consecutive Characters

import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		// first create a string buikder we want to make a change 
		// jaisa koi last character ayee ussa direct add kar do
		// baki 1 character add karo rhen 2 chacater sa first character ko minus karoo
		StringBuilder sb = new StringBuilder(); // building string builder
		for(int i=0; i < str.length(); i++){ // taking character
			//for last character
			if(i == str.length()-1){ // if its is last char
				char ch1 = str.charAt(i);// uss char ko fetch karoo
				sb.append(ch1);// or add karo do last mai
			}else{
				// for other char other than last
				char ch1 = str.charAt(i); //first chac ko liya
				char ch2 = str.charAt(i+1); // first sa aga vala char ko liya

				sb.append(ch1); //phela first char ko add kara then
				sb.append(ch2-ch1); // then 2nd char to minus kara first sa or ussa add kaara
			}
		}

		return sb.toString(); // string builder ko bapis string mai convert kara
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}

/*Time Complexity :

O(n) where n is the length of the string

Now, a question for you. What do you think is the time complexity for this problem? Yes, it is O(n) . 
You are running one loop from 1 to str length - 1 and in each iteration, you are performing constant-time operations.

It is O(1) when appending single characters to StringBuilder. A StringBuilder is like an ArrayList.
 When you append a single item the cost is O(1)

SPACE COMPLEXITY :

O(n)

And finally the .toString() before return that is also O(n). So, it is O(n+n) i.e O(n).*/