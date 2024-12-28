package dynamicandbackprogramming;


public class fibnocci {

    static int [] nums={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    static int [] nums2={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println("this is second"+fib(10));
        for(int x:nums){
            System.out.println(x);

        }
  
    }

    public static int fib(int n){

        if(n<=1){
            return n;
        }
       if(nums[n]!=-1){
           return nums[n];
       }
      nums[n]= fib(n-2)+fib(n-1);
       return nums[n];
    }

    public static int fib2(int n){
        nums2[0]=1;
        nums[1]=1;

        for (int i = 2; i <= n; i++) {
            nums2[i]=nums[i-2]+nums2[i-1];

        }
        return nums2[n];
    }




}
