// Count Digits In A Number

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int dig = 0;
    while(n>0){
        int rem = n%10;
        n = n/10;
        dig++;
    }
    System.out.println(dig);  
   }
  }