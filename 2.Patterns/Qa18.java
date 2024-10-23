// Pattern 18

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 0;
        int stars = n;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=spaces;j++)
            {
                System.out.print("\t");
            }
            for(int j =1;j<= stars;j++)
            {
            if( i > 1 && i<=n/2 && j>1 && j<stars)
            {
                System.out.print("\t");
            }
            else
            {
                System.out.print("*\t");           
            }
            }
            if( i <= n/2)
            {
                stars -= 2;
                spaces++;
            }
            else
            {
                stars += 2;
                spaces--;
            }
            System.out.println();
            }
        }
    }
	
	/*Time Complexity :

Here we are running 2 for loop 1 for rows and the other within it for columns so total time complexity will be : O(n^2).


Space Complexity :

We are not using any extra space so space complexity is constant O(1).*/