// Print All Permutations Of A String Iteratively

import java.io.*;
import java.util.*;

public class Main {
    // sbase phela factorial nikal le(abc 3 string ha toh factorial of 3)
    // then 3/0 = a0b1c2(3/0 -> 2/0-0 -> 1/0-0 = 0-0); 3/1 = bac; 3/2 = cab;
    // then 3/4 = acb; 3/4 = bca; 3/5 = cba;
	public static void solution(String str){
		// write your code here
        int n = str.length(); // we got the string length from here
        int f = factorial(n); // we got factorial value from here(fun)

        for(int i = 0; i < f; i++){ //loop 0 sa 5 tak jaye ga (3/0 to 3/5)
            StringBuilder sb = new StringBuilder(str); //creating string builder because string has to change
            int temp = i;
            for(int div = n; div >= 1; div--){ // first divide by 3 then 2 then 1
                int q = temp/div; // (bca)to get the quo value for after division(4 -> 1(r=1) -> 0(r=0) -> 0(r=0))
                int r = temp%div; // r give(a0b1c2 -> b1c2a0) = r=1->b then r is del in line 21 after printing r value
                                 // r give beacuse b is printed(a0c1 -> c1a0) = r=1->c then r is del in line 21 after printing r value         
                System.out.print(sb.charAt(r)); // here print r
                sb.deleteCharAt(r); // del r value

                temp = q; //first time temp=4 and div=3 and then temp=1 and div=2(temp=q)
            } 
            System.out.println(); // next line pa input ka liya
        }
	}
    // first want factorial
    public static int factorial(int n){
        int val = 1;
        for(int i = 2; i <= n; i++){
            val = val*i;
        }
        return val;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

