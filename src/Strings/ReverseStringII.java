package Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringII extends Longestpalindroem{



    public static void main(String[] args) {
        List<String>l1=new ArrayList<>();
        StringBuilder s4= new StringBuilder();
        int j = se2.length();
        int k =0;
        for (int i = se2.length()-1; i >-1; i--) {
           if (se2.charAt(i)==' '){
               j--;
               StringBuilder s5 = new StringBuilder();
               while(se2.charAt(j)!=' ' && j>=0){
                   s5.insert(0,se2.charAt(j));

                   j--;
               }

            l1.add(s5.toString());

           }
        }
        if(j>=0){
            StringBuilder s5 = new StringBuilder();
            while(j>=0){
                s5.insert(0,se2.charAt(j));
            }
        }
        String re = String.join(" ", l1);
        System.out.println(re);
    }
    
    
    
    
    
}
