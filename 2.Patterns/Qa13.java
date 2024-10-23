// Pattern 13

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0; i<n; i++){
            int val = 1;
            for(int j=0; j<=i; j++){
                System.out.print(val + "\t");
                val = val*(i-j)/(j+1);
            }
            
            System.out.println();
        }
    }
}

/*Time Complexity :

Here we are running 2 for loop 1 for rows and the other within it for columns so total time complexity will be : O(n^2).


Space Complexity :

We are not using any extra space so space complexity is constant O(1).*/