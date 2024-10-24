// Span Of Array

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
        // hmm man leta ha ki maximum and minimum value vi arry i first size ha 
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
        }
        int span = max - min;
        System.out.println(span);
}
}

/*Time Complexity:

O(n) A "for" loop is used to find the minimum and maximum values in the array; travelling the n sized array makes the time complexity O(n).


Space Complexity:

O(1) Since no extra space is used, therefore space complexity is constant.*/