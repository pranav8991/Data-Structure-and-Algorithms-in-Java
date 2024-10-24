//Decimal To Any Base

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
    // write code here
       int p = 1;
       int ans = 0;
       while(n>0){
           int rem = n%b;
           n = n/b;
           ans  = ans + rem*p;
           p = p*10;
       }
       return ans;
   }
  }
  
/*TIME COMPLEXITY :

We are extracting digits of number n and performing some minute calculations, which will take O(log10 n)
time as there can be maximum floor(log10 n) digits in a number n.


Space Complexity

We just need to store a few variables like the answer, multiplier and remainder, hence O(1) auxiliary space is required.*/  
  
  
  
  
  
  
  
  
  