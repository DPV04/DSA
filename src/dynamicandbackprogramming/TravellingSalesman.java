package dynamicandbackprogramming;

import java.util.ArrayList;
import java.util.List;

public class TravellingSalesman {

    static int [] [] arr = {{1,2,3},{4,5,6},{6,7,8}};

    static int n = arr.length;

    static List<Integer>l1=new ArrayList<>();

    static List<List<Integer>>l3=new ArrayList<>();


    public static void main(String[] args) {
        travel(0);

        System.out.println(l3);


    }

    public static void travel(int index){

        if (index==n){
            if(l1.size()==n){
                l3.add(new ArrayList<>(l1));

            return;
        }


         travel(index+1);
         l1.add(index);
         travel(index+1);

         l1.removeLast();



    }










}}

