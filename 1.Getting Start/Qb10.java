// Rotate A Number

import java.util.*;
   
   public class Main{
   // 21543 rotate by 2
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int r = scn.nextInt();
     int temp = n;
     int nod = 0;
     //we want to know how many numbe are there 
     while(temp>0){
         temp = temp/10;
         nod++;
     }
     r=r%nod; //for bigger positive number value
     if(r<0){ // negative position ko positive mai convert karna
         r += nod; // -2 ki rotation ki jaga +3 rotation kar lo
     }
     
     int div = 1;
     int mul = 1;
     // suppose 5 number ha 5 bar rotate karna ha 
     for(int i=1; i<=nod; i++){ // loop 5 bar chala ga
         if(i<=r){ // jitna sa rotate karna ha
             div = div*10; // 2 bar div
         }else{
             mul = mul *10; // 3 bar mul hoga
         }
         // loop sara 5 bar chala ga or div or mul mil jaye ga ussa sa
     }
         int quo = n/div; // 100 mil gya
         int rem = n%div; // 1000 value mil gya 
         int final_output = rem*mul+quo; // total value ko add kar diya
         System.out.print(final_output);
    }
   }
   
   /*Time Complexity:

Getting the number of digits in n will take O(log10 n) time. Finding 10k and 10(nod - k) will take O(k) and O(nod - k) 
time respectively since k is of the order of the number of digits (after taking mod with nod), its time complexity will also be O(log10 n).
 Finding q and r are constant time-taking operations. Hence, the overall time complexity will be O(number of digits) = O(log10 n).


Space Complexity:

We are just using integer variables nod, multiplier, divisor, r, q, which will take constant {O(1)} space. 
I hope, you enjoyed solving the problem with me. Let's meet now to deep dive into how the number system works from the next article.*/