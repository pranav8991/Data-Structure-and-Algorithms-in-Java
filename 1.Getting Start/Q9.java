// Inverse Of A Number

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int p = 1;
  int inv = 0;
  while(n>0){
      int r = n%10;
      n = n/10;
      inv = inv + p*(int)Math.pow(10, r-1);
      p++;
  }
  System.out.print(inv);   
 }
}

/*Time Complexity:

Since we are running a loop that reduces the number digit by digit, i.e. extracts one digit in each iteration, 
time complexity will be O(number of digits). Now, for a number N, the number of digits will be floor log N. 
Hence time complexity will turn out to be O(log10 N). Note: We add power * Math.pow(10, digit - 1) 
to our inverted variable at each step of the iteration. Calculating 10(digit-1) will take log(digit - 1) time, 
which is negligible as digits are less than 8, thus log(8-1) can be considered constant.


Space Complexity:

We are not using any data structure, hence it is taking constant space. Thus space complexity will be O(1).
Note: You may think that we have used two integers inverted and power, which will take 4 or 8 bytes each 
(depending on the system architecture), hence we should write our space complexity as O(8) or O(16). 
But we generally ignore such constant space in Big - O complexity analysis. I hope, you liked the article. 
If you have any doubt, you can ask them in Pepcoding's youtube video comment section or our Telegram channel.*/