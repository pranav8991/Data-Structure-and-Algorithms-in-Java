// Pattern 16

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int stars = 1;
    int spaces = 2*n-3;
    
    for(int i=1; i<=n;i++){
        int var = 1;
        for(int j=1; j<=stars; j++)
        {
            System.out.print(var + "\t");
            var++;
        }
        
        for(int j=1; j<=spaces; j++)
        {
            System.out.print("\t");
        }
        if(i==n)
        {
            stars--;
            var--;
        }
        for(int j=1; j<=stars; j++)
        {
            var--;
            System.out.print(var + "\t");
        }
        stars++;
        spaces-=2;
        System.out.println();
    }
 }
}

//Time complexity O(N^2) Space complexity O(1)