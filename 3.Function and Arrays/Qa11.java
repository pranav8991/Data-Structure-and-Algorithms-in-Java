// Sum Of Two Arrays

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    // arry number 1
    int n1 = scn.nextInt();
    int[] one = new int[n1];
    for(int i=0; i<one.length; i++){
        one[i] = scn.nextInt();
    }
    
    //arry number 2
    int n2 = scn.nextInt();
    int[] two = new int[n2];
    for(int i=0; i<two.length; i++){
        two[i] = scn.nextInt(); 
    }
    //**********************************************
    int[] sum = new int[n1>n2 ? n1:n2];
    int i = one.length-1;
    int j = two.length-1;
    int k = sum.length-1;
    int c = 0;
    
    while(k>=0){
        int d = c;
        if(i>=0){
            d = d+one[i];
        }
        if(j>=0){
            d = d+two[j];
        }
        if(d>=10){
            c = 1;
            d = d-10;
        }else{
            c = 0;
            d = d;
        }
        sum[k] = d;
        i--;
        j--;
        k--;
    }
    if(c>0){
        System.out.println(c);
    }
    for(int t = 0; t<sum.length; t++){
        System.out.println(sum[t]);
    }
    
 }

}

/*Time Complexity:

O(n) This time complexity is linear because for and while loops are used.


SPACE COMPLEXITY:

O(n) As a 1D array is used in the code, therefore space complexity is constant.*/