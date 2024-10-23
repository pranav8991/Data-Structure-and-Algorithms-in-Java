// The Curious Case Of Benjamin Bulbs

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int div = 1; div*div <= n; div++){
        System.out.println(div*div);
    }  
   }
  }
  
  