// Saddle Price

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();

       int[][] arr = new int[n][n];
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[0].length; j++){
               arr[i][j] = scn.nextInt();
           }
       }

       for(int i = 0; i < arr.length; i++){
           // find min in row -> potential saddel point
           // row vise hrr row mai 1 minimum point dund liya 
            int min = arr[i][0]; // first value ko man liya ki yeah minimum ha 
            int psj = 0; // kosa colum mai mila ha
            for(int j = 1; j < arr[0].length; j++){ // same row ka hrr colum mai gya 
                if(arr[i][j] < min){ // check kara fist value to hrr coulum ka sath ussi row ki
                    min = arr[i][j]; // aagar first value small nhi ha then ussa update kar dena 
                    psj = j; //cloumn ko update kar diya
                }
            }
            // confirm if it is maximum in the column -> true saddle point
            // abb check kara hr point ko colum viseki vahi saddle point ha ki nhi
            boolean isSaddle = true; // man liya ki ha 
            for(int ii = 0; ii < arr.length; ii++){ // uss value ko ussi ka colum mai check kara row vise
                if(arr[ii][psj] > min){ // ara vo glt prove huya 
                    isSaddle = false; // then vo saddle point nhi ha 
                    break;
                }
            }

            if(isSaddle == true){ // agar vo ha point the ussa print kar do
                System.out.println(min);
                return;
            }
       }

       System.out.println("Invalid input");
    }

}

/*Time Complexity:

In the worst-case scenario we might need to traverse all the elements in the matrix, so the time complexity comes out to be n square (n*n).


Space Complexity :

Since we are using only a handful of variables, space complexity is constant, O( 1 ).*/