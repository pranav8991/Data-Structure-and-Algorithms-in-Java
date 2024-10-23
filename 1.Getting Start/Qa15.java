// Max Min 2

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        //Enter no. of elements you want in array
        n = s.nextInt();
        int a[] = new int[n];
        //Enter all the elements
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print(a[n-2] + " ");
        System.out.print(a[1] + " ");
    }
}