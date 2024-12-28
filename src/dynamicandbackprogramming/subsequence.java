//package dynamicandbackprogramming;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class subsequence {
//    static List<Integer> l1=new ArrayList<>();
//    static List<List<Integer>>l2=new ArrayList<>();
//    static int MAX =0;
//    public void func() {
//        int [] arr={1,3,1,2,4,6,3,2};
//        dfs(arr,0);;
//      for (List<Integer> x : l2){
//          System.out.println(x);
//      }
//    }
//
//
//     public List<List<Integer>> dfs(int [] arr , int index){
//
//        if (arr.length==index){
//            l2.add(new ArrayList<>(l1));
//            return l2;
//        }
//        dfs(arr,index+1);
//
//        l1.add(arr[index]);
//
//        dfs(arr, index+1);
//
//        l1.remove(l1.size()-1);
//       return l2;
//     }
//
//     public boolean checkincrease(List<Integer>l3){
//        if()
//     }
//}
