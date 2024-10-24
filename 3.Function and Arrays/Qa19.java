// First And Last Index

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //**************************
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    //******************************
    int data = scn.nextInt();
    
    //*********First Index**********
    
    int left = 0;
    int right = arr.length-1;
    int first_index = -1;
    
    while(left<=right){
        int mid = (left + right)/2; // it give the arry value
        
        if(data>arr[mid]){
            left = mid+1; // it submit the real value inside it
        }else if(data<arr[mid]){
            right  = mid-1;
        }else{
            first_index = mid;
            right = mid-1;
        }
    }
    System.out.println(first_index);
    
    //*********Last Index***************
    
    int left2 = 0;
    int last_index2 = -1;
    int right2 = arr.length-1;
    
    
    while(left2<=right2){
        int mid = (left2 + right2)/2; // it gives arry value
        
        if(data>arr[mid]){
            left2 = mid+1;  // it compare real value
        }else if(data<arr[mid]){
            right2 = mid-1;
        }else{
            last_index2 = mid;
            left2 = left2+1;
        } 
    }
    System.out.println(last_index2);
 }

}

/*Time Complexity: O(logn).

We are doing binary search only. Even if we are continuing our binary search after finding an element,
it is still reducing the search space by half of the original size. Hence, the time complexity will remain as O(log2 n).


SPACE COMPLEXITY: O(1)

O(1) auxiliary space is required to store three integer pointers, low, high and mid.*/