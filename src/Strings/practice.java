package Strings;

import java.util.ArrayList;

public class practice {

    StringBuilder s2 = new StringBuilder("bye");


    public static void main(String[] args) {
        String s2 = "helloooo";
        StringBuilder s3 = new StringBuilder(s2);

        System.out.println(s2+1);//1 is converted by the Wrapper class Integer
        System.out.println(new ArrayList<>()+s2);//Here th println function has been overloaded.

        for (int i = s2.length()-1; i >-1 ; i--) {
            s3.append(s2.charAt(i));
//            s3.reverse();
        }




        s3.reverse();
        System.out.println(s3);

    }







}



