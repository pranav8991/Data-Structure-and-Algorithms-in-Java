//Any Base To Any Base

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sb = scn.nextInt();
      int db= scn.nextInt();
       
      int getanswer = anybase_to_anybase(n, sb, db);
      System.out.println(getanswer);
      
  }   
   
   
   public static int anybase_to_anybase(int n, int sb, int db){
       int bs = anybase_to_decimal(n, sb);
       int bss = decimal_to_anybase(bs, db);
       return bss;
       
   }
   public static int anybase_to_decimal(int n, int b){
       int p = 1;
       int ans = 0;
       while(n>0){
           int rem = n%10;
           n = n/10;
           ans  = ans + rem*p;
           p = p*b;
       }
       return ans;
   }
   public static int decimal_to_anybase(int n, int b){
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
  
  // Some test cases pasess
  
  /*import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      int dn = getValueInBase(n, b1, b2);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b1, int b2){
    // write code here
       int p = 1;
       int ans = 0;
       while(n>0){
           int rem = n%b1;
           n = n/b1;
           ans  = ans + rem*p;
           p = p*b2;
       }
       return ans;
   }
  }*/
  
  
/*TIME COMPLEXITY :

The time complexity calculation shouldn’t be difficult because it is already discussed in the previous article. 
And we are just reusing the functions. So it will be logarithmic. O(log10(n) + log10(n)) = O(log10(n))


SPACE COMPLEXITY :

We just need to store a few variables like the answer, multiplier and remainder, hence O(1) auxiliary space is required.*/