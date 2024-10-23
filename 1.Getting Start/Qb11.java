// Gcd And Lcm

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();

      int temp1 = n1;
      int temp2 = n2;
      while(temp1 % temp2 != 0){
          int rem = temp1 % temp2;
          temp1 = temp2;
          temp2 = rem; 
        }
        int gcd = temp2;
        int lcm = (n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}

/*Time Complexity:

O(min(a, b)) Since we have just one loop from min(a, b) to 1.


Space Complexity:

O(1) Since no auxiliary space was needed. This is not a very good optimized approach hence we are avoiding the code for this.*/

