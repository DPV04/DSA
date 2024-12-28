package dynamicandbackprogramming;

public class frogjump {


    public static void main(String [] args){

        int [] arr ={10,30,20,10,30,};
        int [] dp = new int [arr.length];
        System.out.println(jump(arr,arr.length-1 ,dp));

    }

    public static int jump(int [] arr , int N,int [] dp){
        if (N==0){
            return arr[0];

        }

        if (dp[N]!=0){
            return dp[N];
        }
        int jump1=jump(arr,N-1 ,dp)+Math.abs(arr[N]-arr[N-1]);
        int jump2=Integer.MAX_VALUE;
        if(N>1) {
            jump2 = jump(arr, N - 2, dp) + Math.abs(arr[N] - arr[N - 1]);
        }
        dp[N] = Math.min(jump1, jump2);

        return dp[N];

    }
}
