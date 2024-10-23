// Pattern 7

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }
            System.out.println("*");
            spaces++;
        }
    }
}

/*Time Complexity -

Thare are time Complexity is O(n2).


Space Complexity-

Thare are Space Complexity is O(1) .*/