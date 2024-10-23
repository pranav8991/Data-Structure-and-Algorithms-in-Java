// Print All Primes Till N

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int low = scn.nextInt();
      int high = scn.nextInt();
      for(int i = low; i<=high; i++){ 
      boolean isPrime = true;
      for(int div = 2; div*div <= i; div++){
          int rem = i%div;
          if(rem == 0){
              isPrime = false;
              break;
          }
      }
      
      if(isPrime == true){
          System.out.println(i);
      }  
    }
   }
  }
  
  