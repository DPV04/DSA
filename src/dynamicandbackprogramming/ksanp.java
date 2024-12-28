package dynamicandbackprogramming;

public class ksanp {




    public static  int run(int [][] dp,int [] val , int [] wt , int index, int bagwt){
        if (index==0|| bagwt==0){
            if(wt[0]<=bagwt){
                return val[0];


            }return 0;
        }
        if(dp[bagwt][index]!=0){
            return dp[bagwt][index];
        }

        int nottake =run( dp,val ,  wt ,  index-1,  bagwt);
        int take = Integer.MIN_VALUE;
        if(wt[index]<=bagwt){
            take=val[index]+run( dp,val ,  wt ,  index-1,  bagwt-wt[index]);;
        }
        dp[bagwt][index]=Math.max(take,nottake);
        return dp[bagwt][index];
    }



    public static void main(String[] args) {
        int [] val ={30,40,50};
        int [] wt ={3,2,5};
        int bagwt=6;
        int [][] dp = new int [bagwt+1] [val.length];
        System.out.println(run( dp,val ,  wt ,  val.length-1,  bagwt));
    }



}
