// Digits Of A Number

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int temp = n;
    int dig = 0;
    while(n>0){
        n = n/10;
        dig++;
    }
    int div = (int)Math.pow(10, dig-1);
    while(div>=1){
        int q = temp/div;
        temp = temp%div;
        System.out.println(q);
        div = div/10;
    }  
   }
  }