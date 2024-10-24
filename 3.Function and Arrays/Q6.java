// Any Base Subtraction


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getdifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getdifference(int b, int n1, int n2){
       // write ur code here
       int p = 1;
       int ans = 0;
       int c = 0;
       while(n2>0){
           int rem1 = n1%10;
           int rem2 = n2%10;
           
           n1 = n1/10;
           n2 = n2/10;
           
           int d = rem2 + c- rem1;
           if(d<0){
               c = -1;
               d = d+b;
           }else{
               c = 0;
               d = d;
           }
           
           ans = ans + d*p;
           p = p*10;
       }
       return ans;
   }
  }
  
/*TIME COMPLEXITY :

O(d) {where d is the number of digits in a larger number} or (log10 n). 
Why (log10 n)? This is because we are deriving the digits of the number by dividing the number by 10. 
So, if we keep on dividing the number by 10, the complexity becomes (log10 n). Think about this!!!


SPACE COMPLEXITY :

O(1) as we have not used any extra memory*/