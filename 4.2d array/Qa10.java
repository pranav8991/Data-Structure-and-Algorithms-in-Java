// Search In A Sorted 2d Array

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
        // input which position we have to find
        int x = scn.nextInt();
        int i = 0;
        int j = arr[0].length-1;
        // find value
        while(i<arr.length && j>=0){
            if(x>arr[i][j]){
                i++;
            }else if(x<arr[i][j]){
                j--;
            }else{
                System.out.println(i);
                System.out.println(j);
                return;
            } 
        }
        System.out.println("Not Found");
    }

}

/*Time Complexity:

Whereas, the time-complexity drops from O(m*n) to O(m+n).


Space Complexity:

The space-complexity of this approach is constant, O(1).*/