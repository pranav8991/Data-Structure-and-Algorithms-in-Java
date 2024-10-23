// Pattern 9

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
            if(i==j || i+j == n+1)
            {
               System.out.print("*\t"); 
            }
            else{
                System.out.print("\t");    
            }
            }
            System.out.println();
        }
    }
    }
	
/*Time Complexity :

The time complexity of this solution is O(n^2), where n is the given input number since we use two nested loops which execute for n times.


Space Complexity :

The space complexity for this solution is constant i.e. O(1), since we do not use any extra data structure.*/