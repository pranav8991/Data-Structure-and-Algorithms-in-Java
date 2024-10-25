// Remove Primes

import java.io.*;
import java.util.*;

public class Main {

	//simple find prime number
    public static boolean isPrime(int val){
        for(int div = 2; div*div<=val; div++){
            if(val%div == 0){
                return false;
            }
        }
        return true;
    }
    public static void solution(ArrayList<Integer> al){ // created array list
		//ulta loop chilaaya, so that we dont miss loop index
        for(int i = al.size()-1; i>=0; i--){
            int val = al.get(i); // getting value of i and put in val
            if(isPrime(val) == true){ // if prime is true.
                al.remove(i); //remove all prime value
            }
        }
		 
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}