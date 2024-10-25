//  Spiral Display

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int total = n*m;
        int cnt = 1;

        while(cnt<total){
            //left wall
            for(int i=minr, j=minc; i<=maxr && cnt<=total; i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall
            for(int i=maxr, j=minc; j<=maxc && cnt<=total; j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            //right wall
            for(int i=maxr, j=maxc; i>=minr && cnt<=total; i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            //top wall
            for(int i=minr, j=maxc; j>=minc && cnt<=total; j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }

}

/*Time Complexity:

O(n^2) As there is nested for loop and the outer for loop runs n times. There are two inner for loops. 
Either one will run in each iteration. Making the time complexity: O(n)*O(m)= O(n*m).


Space Complexity:

O(1) Since, we are not using any auxiliary space and hence the space complexity is O(1).*/