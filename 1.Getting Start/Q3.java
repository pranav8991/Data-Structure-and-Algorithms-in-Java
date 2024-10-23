// Is A Number Prime

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      for(int i = 1; i<=t; i++){ 
      int n = scn.nextInt();
      boolean isPrime = true;
      for(int div = 2; div*div <= n; div++){
          int rem = n%div;
          if(rem == 0){
              isPrime = false;
              break;
          }
      }
      
      if(isPrime == true){
          System.out.println("prime");
      }else{
          System.out.println("not prime");
      }  
    }
   }
  }
  
//Time Complexity:

//O(t * square root n) A for loop runs for t times and for each iteration a while loop runs for root n times making the time complexity of this program to be O(t * sq.rt(n)).


//Space Complexity:

//O(1) Since no effective extra space has been used, therefore the time complexity of the program remains constant.