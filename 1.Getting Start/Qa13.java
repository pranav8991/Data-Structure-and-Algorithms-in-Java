// Pythagorean Triplet

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();

    int max = a;

    if(max < b){
        max = b;
    }
    if(max < c){
        max = c;
    }

    if(max == a){
        System.out.println(((b*b) + (c*c)) == (a*a));
    }
    else if(max == b){
        System.out.println(((a*a) + (c*c)) == (b*b));
    }
    else{
        System.out.println(((b*b) + (a*a)) == (c*c));
    }  
   }
  }
  
  /*Time Complexity:

Finding a maximum of 3 numbers, finding whether a2 + b2 = c2 or not, all are constant work, hence time complexity will be O(1).


Space Complexity:

We are not using any data structure, hence it is taking constant space. Thus space complexity will be O(1). */