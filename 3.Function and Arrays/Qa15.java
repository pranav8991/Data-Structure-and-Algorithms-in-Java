// Inverse Of An Array

import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int[] inv = new int[a.length];
    for(int i = 0; i<a.length; i++){
        inv[a[i]] = i;
    }
    
    return inv;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}

/*Time Complexity: O(n)

A "for" loop is used to put the index value as data in a new array from the input array; travelling the n sized array makes the time complexity O(n).


SPACE COMPLEXITY: O(n)

As a new array (inv) of size n has been used, therefore space complexity becomes O(n).*/