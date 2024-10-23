// Pattern 4

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 0;
        int stars = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }
            spaces++;
            stars--;
            System.out.println();
        }
    }
}

/*Time Complexity :

The time complexity of this solution is O(n^2), where n is the given input number since the outer for loop implements for n times and the inner loop for stars also implements for n times and when this loop has to execute only once then the loop for spaces has to implement for n - 1 times. So in terms of big ‘O’ notations, the complexity is O(n^2).


Space Complexity :

The space complexity for this solution is constant i.e. O(1), since we do not use any extra data structure.*/
