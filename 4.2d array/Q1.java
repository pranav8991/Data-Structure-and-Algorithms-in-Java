// 2d Arrays Demo

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in); 
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr = new int[n1][m1];
    for(int i = 0; i<arr.length; i++){
        for(int j =0; j<arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    
    for(int r=0; r<arr.length; r++){
        for(int c=0; c<arr[0].length; c++){
            System.out.print(arr[r][c] + " ");
        }
        System.out.println();
    }
 }

}

/*Time Complexity: O(n^2)

This time complexity is quadratic due to the use of nested for loops.


SPACE COMPLEXITY: O(n^2)

As a 2D array is used to store input values, therefore space complexity is quadratic.*/