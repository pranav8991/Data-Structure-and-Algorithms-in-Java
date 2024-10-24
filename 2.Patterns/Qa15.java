// Pattern 15

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2;
        int stars = 1;
        int val = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces;j++){
                System.out.print("\t");
            }
            int ival = val;
            for(int j=1; j<=stars; j++){
                System.out.print(ival + "\t");
                if(j<=stars/2)
                {
                    ival++;
                    
                }
                else
                {
                    ival--;
                }
            }
            if(i<=n/2)
            {
                spaces--;
                stars+=2;
                val++;
            }
            else
            {
               spaces++;
               stars-=2;
               val--;
            }
            
            System.out.println();
            
        }

    }
}

/*Time Complexity: O(n)

We are running the loop from 1 to n, thus making the time complexity O(n).


Space Complexity: O(1)*/