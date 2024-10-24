// Find Element In An Array

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int v = scn.nextInt();
    int foundit = -1;
    for(int i = 0; i<arr.length; i++){
        if(arr[i]==v){
            foundit = i;
            break;
        }
    }
    System.out.println(foundit);
    
 }

}

/*Time Complexity:

O(n) A 'for' loop is used to find an equivalent value in the array; travelling the n sized array makes the time complexity O(n).


SPACE COMPLEXITY:

Since no extra space is used, therefore space complexity is constant.*/