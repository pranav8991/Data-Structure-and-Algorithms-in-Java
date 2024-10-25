//  Rotate By 90 Degree

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        // transpose the matrix    
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // swap the matrix
        for(int i=0; i<arr.length; i++){
            int left = 0;
            int right = arr[i].length-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

/*Time Complexity:

The time complexity for rotating the matrix by this procedure is O(n2) as for transposing we are traversing the upper triangle 
i.e. we are traversing n2/2 elements and then reversing takes O(n) time and we have to reverse n rows. 
So it becomes O(n2 + n2/2) which is O(n2).


Space Complexity:

The space complexity is O(1) as we are transposing and then reversing in-place and we are not consuming any auxiliary memory. 
Dear reader, we hope that you have now understood the entire procedure of rotating a matrix by 900 .*/