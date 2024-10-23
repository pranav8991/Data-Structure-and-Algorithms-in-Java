// Pattern 5

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2;
        int stars = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }
            if(i<=n/2)
            {
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;    
            }

            System.out.println();
        }
    }
}

/*Time Complexity: O(n)

We are running a loop from 1 to n, so the time complexity becomes O(n).


Space Complexity: O(1)*/