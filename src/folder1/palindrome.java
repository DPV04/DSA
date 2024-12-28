package folder1;

import java.util.ArrayList;
import java.util.List;



public class palindrome {

    static List<String> l1=new ArrayList<>();
    static List<List<String>>l2= new ArrayList<>();

    public static void main(String[] args) {
        String s ="aabbbaaa";
        plaindrome1(s);

        for(List x : l2){
            System.out.println(x);
        }
    }

    public static void plaindrome1(String s){
        checkplaindrome(s,0);

    }

    public static void checkplaindrome(String s , int index){

        for (int i = 0; i < l1.size(); i++) {
            String str= l1.get(i);

            int l = l1.size();
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)!=str.charAt(l-i-1)){
                    return;
                }

            }
        }
        l2.add(new ArrayList<>(l1));



        if (index==s.length()){
            return;
        }

        checkplaindrome(s,index+1);

        l1.add(String.valueOf(s.charAt(index)));

        checkplaindrome(s,index);

        l1.remove(String.valueOf(s.charAt(index)));



    }



}
