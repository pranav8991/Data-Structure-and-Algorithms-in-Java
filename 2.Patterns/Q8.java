// Pattern 8

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }
            
            System.out.println("*");
            spaces--;
        }
    }
}

/*Time Complexity :

Here we are running one for loop to print no. of rows and in that for loop, 
we are doing total nsp operations so our total time complexity will be : O(n^2).


Space Complexity :

We are not using any extra space so space complexity is constant O(1).*/