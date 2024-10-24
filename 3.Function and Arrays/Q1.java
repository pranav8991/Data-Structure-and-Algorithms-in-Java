//Digit Frequency

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int dig = 0;
        while(n>0){
            int r = n%10;
            n = n/10;
            if(r==d){
                dig++;
                
            }
            
        }
        return dig;
    }
}

/*
Time Complexity:

O(log10 n) We are extracting digits of number n which will take O(log10 n) time as there can be maximum floor(log10) digits in a number n.


Space Complexity:

O(1) We just need to store the count of matched digits in an integer variable counter, hence O(1) auxiliary space is required.*/