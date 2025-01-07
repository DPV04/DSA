package Strings;

import java.util.*;

public class WordBreak {
    Map<String,Boolean> hash=new HashMap<>();
    Set<String>wordDict= new HashSet<>();

    static List<String>l= new ArrayList<>();
    static StringBuilder s1 = new StringBuilder();
    static List<List<String>>l3=new ArrayList<>();
    static String a = "helllohoware";

    public static void main(String[] args) {
        l.add("helllo");
        l.add("how");
        l.add("are");
        System.out.println(l);
        String s = a.substring(3);
        System.out.println(s);

        System.out.println(generate(0,a));
        System.out.println(l);
        for (int i = 0; i < a.length(); i++) {
            String sw = a.substring(0,0);
            System.out.println(sw);
        }



    }


    public static boolean generate(int index,String s2){

        //hello


        if( s2.isEmpty()){
            return true;
        }

        for (int i = 1; i < s2.length(); ++i) {
            String prefix = s2.substring(0,i);
            System.out.println(prefix);

            if(l.contains(prefix)&&generate(0,s2.substring(i))){
                return true;
            }
        }
        return false;

    }



    public boolean wordBreak(String s, List<String> wordict) {

        wordDict=new HashSet<>(wordict);

        if(s.isEmpty()){
            return true;
        }

        if(hash.containsKey(s)){
            return hash.get(s);
        }


        int length=s.length();


        for(int i = 1;i<=length;++i){
            String prefix = s.substring(0,i);

            if(wordDict.contains(prefix)&& wordBreak(s.substring(i),wordict)){
                hash.put(s,true);
                return true;
            }
        }
        return false;
    }












}
