// Pattern 2

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

/*Time Complexity

There are the time complexity is o(n2) ;


Space Complexity-

There are the Space complexity is o(1);*/