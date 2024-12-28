package folder1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C {
  static List<Integer>l1=new ArrayList<>();
  static List<Integer>l2=new ArrayList<>();
  static List<List<Integer>>l3=new ArrayList<>();
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6};
        int n =2;




        for (int i = 0; i < nums.length; i++) {
            l2.add(nums[i]);

        }
//        Comparator<Integer> c= (Integer a,Integer b)->(a<b)? 1:(b<a)? -1: 0;
//
//        Collections.sort(l2,c);
//        System.out.println(l2);

        while (l2.getFirst() != nums[nums.length-1-n]) {
            l2.add(1,l2.removeLast());
        }
        System.out.println(l2);

    }
}

