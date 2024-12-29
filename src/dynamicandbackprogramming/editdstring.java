package dynamicandbackprogramming;

public class editdstring {


    static String s1 = "abcd";
    static String s2 = "bscdf";


    public static  int edit(int [][] dp , int i,int j){
        if(i<0){
            return i+1;
        }

        if(j<0){
            return j+1;
        }

        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return edit(dp, i-1, j-1);
        }

        return dp[i][j]= Math.min(edit(dp, i-1, j-1),Math.min(edit(dp, i, j-1), edit(dp, i-1, j)));



    }



    public static void main(String[] args) {

        int [] [] dp = new int [s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                dp[i][j]=-1;
            }
        }

        System.out.println(edit(dp,s1.length()-1,s2.length()-1));







    }




}
