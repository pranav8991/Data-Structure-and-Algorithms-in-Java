// Broken Economy

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //***********array************
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int data = scn.nextInt();
    int left = 0;
    int right = arr.length-1;
    int floor = -1;
    int ceil = -1;
    while(left<=right){
        int mid = (left+right)/2;
        
        if(data>arr[mid]){
            left = mid+1;
            floor = arr[mid];
        }
        
        else if(data<arr[mid]){
            right = mid-1;
            ceil = arr[mid];
        }
        
        else{
            floor = arr[mid];
            ceil = arr[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}

/*Time Complexity: O(logn)

This time complexity is logarithmic since a binary search-like approach is used and the search interval repeatedly gets reduced by half.


SPACE COMPLEXITY: O(1)

Since no extra space is required for solving the problem therefore the space complexity is constant.*/