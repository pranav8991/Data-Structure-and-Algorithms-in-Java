// Exit Point Of A Matrix

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr = new int[n1][m1];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]  = scn.nextInt();
            }
        }
        int i=0;
        int j=0;
        int dir = 0;
        while(true){
            dir = (dir + arr[i][j]) % 4;
            if(dir==0){
                j++;
                if(j==arr[0].length){
                    j--;
                    break;
                }
            }else if(dir == 1){
                i++;
                if(i==arr.length){
                    i--;
                    break;
                }
            }else if(dir == 2){
                j--;
                if(j==-1){
                    j++;
                    break;
                }
            }else{
                i--;
                if(i==-1){
                    i++;
                    break;
                }
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}

/*Time Complexity:

We have already mentioned that the time complexity of this method is O(mxn) where m is the number of rows and n is the number of columns. 
You can see we may have to traverse a large part of the 2-D array depending upon the combinations of values in the matrix. 
Therefore, the time complexity is O(mxn). If the array is a square matrix, we may write the time complexity is: O(n2)


Space Complexity:

The Space Complexity for this problem will be O(1) as we have not used any extra array or any extra memory to solve the problem.*/