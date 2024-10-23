// Pattern 14

import java.util.*;

public class Main {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(x + " * " + i + " = " + (x*i));
            }
        }
    }
	
/*Time Complexity :

The time complexity of this solution is constant i.e.O(1), since the for loop always runs for 10 times, so in terms of big ‘O’ notation, 
the complexity is constant.


Space Complexity :

The space complexity for this solution is constant i.e. O(1), since we do not use any extra data structure.*/