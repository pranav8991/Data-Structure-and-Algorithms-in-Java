// Rotate An Array

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

    public static void reverse(int[] a, int left_index, int right_index){
    // write your code here
    while(left_index<right_index){
        int temp = a[left_index];
        a[left_index] = a[right_index];
        a[right_index] = temp;
        
        left_index++;
        right_index--;
    }
  }
  
  public static void rotate(int[] a, int k){
    // write your code here
    k = k%a.length;
    if(k<0){
        k = k+a.length;
    }
    reverse(a,0,a.length-k-1);
    reverse(a,a.length-k,a.length-1);
    reverse(a,0,a.length-1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}

/*Time Complexity: O(n)

This is because we have to traverse the array and its parts to reverse it.
 So, the time complexity for reversing the array and its parts will be O(n) + O(n) + O(n)=O(n).


SPACE COMPLEXITY: O(1)*/