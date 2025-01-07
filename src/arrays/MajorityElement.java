package arrays;

import java.util.HashMap;

public class MajorityElement {


    static HashMap<Integer,Integer>hash=new HashMap<>();

    public static void main(String[] args) {
        int [] arr ={1,1,1,1,1,1,8};
        int major = 0;

        for (int i = 0; i < arr.length; i++) {

            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);

            if (hash.get(arr[i])>arr.length/2){
                major= arr[i];
            }


        }

        System.out.println(major);
    }





}
