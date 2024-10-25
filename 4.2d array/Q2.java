// Matrix Multiplication

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
//***************2d array1********************
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] one = new int[n1][m1];
    for(int i=0; i<one.length; i++){
        for(int j=0; j<one[0].length; j++){
            one[i][j] = scn.nextInt();
        }
    }
//***************2d array2*********************    
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] two = new int[n2][m2];
    for(int i=0; i<two.length; i++){
        for(int j=0; j<two[0].length; j++){
            two[i][j] = scn.nextInt();
        }
    }
    if(m1!=n2){
        System.out.println("Invalid input");
        return;
    }
    int[][] pred = new int[n1][m2]; //phela ki row or dusra ka column.
    for(int i=0; i<pred.length; i++){
        for(int j=0; j<pred[0].length; j++){
            int val = 0;
            for(int k=0; k<m1; k++){ // particular point ka liya jaha calculation ho rha hoo
                val = val + one[i][k]*two[k][j]; 
            }
            pred[i][j] = val;
        }
    }
//*************     MATRIX ADDITION    *****************************************
    /*int[][] pred = new int[n2][m2]; //phela ki row or dusra ka column.
    for(int i=0; i<pred.length; i++){
        for(int j=0; j<pred[0].length; j++){
            int val = 0;
            for(int k=0; k<m1; k++){ // particular point ka liya jaha calculation ho rha hoo
                val = one[i][j]+two[i][j]; 
            }
            pred[i][j] = val;
        }
    }
    */
//******************************************************************************    
    //value print karvane ka liya 
    for(int i=0; i<pred.length; i++){
        for(int j=0; j<pred[0].length; j++){
            System.out.print(pred[i][j]+" ");
        }
        System.out.println();
    }
 }
}

/*Time Complexity:

O(n^3) This time complexity is cubic because 3 nested for loops are used.


Space Complexity:

O(n^2) As 2D arrays are used to store numbers, therefore space complexity is quadratic.*/