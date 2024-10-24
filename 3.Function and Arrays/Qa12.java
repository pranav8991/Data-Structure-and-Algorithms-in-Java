// Difference Of Two Arrays

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
    int[] sub = new int[n2];
    int i = one.length-1;
    int j = two.length-1;
    int k = sub.length-1;
    int c = 0;
    
    while(k>=0){
        int d = two[j] + c;
        if(i>=0){
            d = d-one[i];
        }
        if(d<0){
            d = d+10;
            c = -1;
        }else{
            d = d;
            c = 0;
        }
        sub[k] = d;
        i--;
        j--;
        k--;
    }
    // agar starting mai zero a jaye yhen we have to remove 
    int indx = 0;
    // count number of zero at starting of the index
    for(indx = 0; indx<sub.length;indx++){
        if(sub[indx] != 0){
            break;
        }
    }
    // jis index sa break huya vaha sa  bahar aya 
    for(int t = indx; t<sub.length; t++){ // t = indx isliya kisya kyui jaha loopbreak huya vaha sa chaloo 
        System.out.println(sub[t]);
    }
    
 }

}

/*Time Complexity:

O(n2) = Linear Let's look at the number of loop passes we are doing. [Ignore the input-output operation].
 There is just one loop where we have iterated through the size of the array a2 i.e. n2. Hence we can clearly state that the time complexity is of order n2.


SPACE COMPLEXITY:

Although we are not using any extra space for calculation just storing the digits of the result in the diff array. 
So still we can assume it is using constant auxiliary space.*/