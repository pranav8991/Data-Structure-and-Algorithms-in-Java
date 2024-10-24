// Subsets Of Array

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < (1 << arr.length); i++){
       int dec = i;
       String str = "";

       for(int j = 0; j < arr.length; j++){
          int r = dec % 2;
          dec = dec / 2;

          if(r == 0){
            str = "-\t" + str;
          } else {
            str = arr[arr.length - 1 - j] + "\t" + str;
          }
       }

       sb.append(str + "\n");
    }

    System.out.println(sb);
 }

}

/*Time Complexity: O((2^n) * n).

Outer loop is running from 0 to limit = 2n : O(2n) The inner loop runs for n times: O(n) 
Inside the inner loop, we are doing a constant work (reducing temp by 2 and updating resultant string) 
Hence the time complexity will be O(2n * n).


SPACE COMPLEXITY: O(n).

If we will only print (not store) all the subsets, then only one string is enough, which can be of maximum size as the size of array, 
hence auxiliary space required will be = O(n). Note: If we will have to store all the subsets, then, since there can be O(2n) subsets,
 hence 2^n strings of n size each, auxiliary space required will be O(n * 2n).*/