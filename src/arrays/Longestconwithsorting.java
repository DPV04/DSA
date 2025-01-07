package arrays;

public class Longestconsecsubsequence {


    public static void main(String[] args) {
        int [] arr ={100,200,300,400,2,4};
        int r = 0;
        int l =0;
        int n = arr.length-1;
        int length = 0;

      while(r<n){
          r++;
          if(arr[r]<arr[r-1]){
              length=Math.max(length,r-l);

              while(l<r){
                  l++;
              }

          }

      }

        System.out.println(length);
    }








}
