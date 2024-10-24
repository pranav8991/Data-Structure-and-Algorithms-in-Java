// Subarray Problem

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    // creating an array
    int n = scn.nextInt();
    int[] arr  = new int[n];
    for(int i =0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    // **************************************
    for(int i=0; i<arr.length; i++){ //abcd
        for(int j=i; j<arr.length; j++){ // a
            for(int k=i; k<=j; k++){
            System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
    
 }

}

/*Time Complexity: O(n^3)

Double nested "for" loop has been used to print all the subarrays of the given array; 
travelling the n sized array 3 times makes the time complexity O(n^3).


SPACE COMPLEXITY: O(1)

Since no extra space is used, therefore space complexity is constant.*/