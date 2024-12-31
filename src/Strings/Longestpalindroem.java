package Strings;

import java.util.ArrayList;
import java.util.List;

public class Longestpalindroem {

    static String s1 = "helllooo";
    static String se="hello my name is dhruva";
    static StringBuilder se2 = new StringBuilder("hello is bye what");


   static StringBuilder s2 = new StringBuilder();
    static  List<StringBuilder>s3 = new ArrayList<>();

    static  int maxlength = Integer.MIN_VALUE;

    static StringBuilder s4 = new StringBuilder("bye");
    static StringBuilder s5 = new StringBuilder("bye");


    public static  boolean checkpalindrome(StringBuilder s6){
        String og = s6.toString();
        String reversed = new StringBuilder(og).reverse().toString();
        return og.equals(reversed);
    }

    public static void palindrome(int index){
        if(index==-1) {
            if(checkpalindrome(s2)){
                s3.add(new StringBuilder(s2));
            maxlength=Math.max(s2.length(),maxlength);
            }

            return;
        }
        palindrome(index-1);
        s2.append(s1.charAt(index));
        palindrome(index-1);
        s2.deleteCharAt(s2.length()-1);

    }

    public static void main(String[] args) {
//        System.out.println(checkpalindrome());
      palindrome(s1.length()-1);
        System.out.println(maxlength);
        System.out.println(s3);
    }



}