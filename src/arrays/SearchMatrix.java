package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchMatrix {


    static int [][]arr={{2,3,4,5},
            {5,6,7,8},
            {8,9,10,11}};

    static  int target = 21;


    public static void main(String[] args) {

        System.out.println(check());
    }

    public static Boolean check(){
       int m = arr.length;
       int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if(columncheck(i,n)){
                return true;
            };

        }
        return false;
    }

    public static boolean columncheck(int i,int n){

        int l = 0;
        int r = n-1;

        while(l<=r){

            int mid = (l+r)/2;

          if (arr[i][mid]==target){
              return true;
          } else if (arr[i][mid]>target) {
              r=mid-1;
          }
          else{
              l=mid+1;
            }

        }
        return false;
    }





}
