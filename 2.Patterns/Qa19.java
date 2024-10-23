// Pattern 19

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            if(i == 1){
                if(j == n || j <= n / 2 + 1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            } else if (i <= n / 2){
                if(j == n || j == n / 2 + 1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            } else if (i == n / 2 + 1){
                System.out.print("*\t");
            } else if (i < n){
                if(j == 1 || j == n / 2 + 1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            } else {
                if(j == 1 || j >= n / 2 + 1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
        }

        System.out.println();
    }

 }
}

/*Time Complexity :

The time complexity of this solution is O(n^2), since we use two nested for loops both of which run for n times.


Space Complexity :

The space complexity for this solution is constant i.e. O(1), since we do not use any extra data structure.*/