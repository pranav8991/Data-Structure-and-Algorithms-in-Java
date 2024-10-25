//  Toggle Optica Document

import java.io.*;
import java.util.*;
public class Main{
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char Lowercase = (char)(ch + 'a' - 'A');
                sb.setCharAt(i,Lowercase);
            }else{
                char Uppercase = (char)(ch + 'A' - 'a');
                sb.setCharAt(i, Uppercase);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}

