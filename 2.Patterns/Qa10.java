// Pattern 10

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int innerspaces = n/2;
        int outerspaces = -1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=innerspaces; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=1; j<=outerspaces; j++){
                System.out.print("\t");
            }
            if(i>1 && i<n)
            {
                System.out.print("*\t");
            }
            if(i<=n/2)
            {
                innerspaces--;
                outerspaces+=2;
            }
            else{
                innerspaces++;
                outerspaces-=2;    
            }

            System.out.println();
        }
    }
}

/*Time Complexity: O(n)

We are running a loop from 1 to n, so the time complexity becomes O(n).


Space Complexity: O(1)*/