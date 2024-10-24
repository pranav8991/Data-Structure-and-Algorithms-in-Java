// Reverse An Array

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
    // write your code here
    int left_index = 0;
    int right_index = a.length-1;
    while(left_index<right_index){
        int temp = a[left_index];
        a[left_index] = a[right_index];
        a[right_index] = temp;
        
        left_index++;
        right_index--;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}

/*Time Complexity :

O(n) since we have traversed the entire array once.


SPACE COMPLEXITY :

O(1) since we have not used any extra language. Note that the number of passes was 2 in the previous method while they are now 1. (think about it!!)*/