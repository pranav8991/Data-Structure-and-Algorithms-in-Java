// Bar Chart

import java.io.*;
import java.util.*;

public class Main{
public static void main(String[] args) throws Exception{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    
    int max = arr[0];
    for(int i = 0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    
    for(int ht = max; ht>=1; ht--){
        for(int j=0; j<arr.length; j++){
            if(arr[j]>=ht){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }
}

/*Time Complexity:

O(n2) This time complexity is quadratic because nested for loops are used.


SPACE COMPLEXITY:

O(n) As a 1D array is used, therefore space complexity is linear.*/