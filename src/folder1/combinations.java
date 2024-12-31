package folder1;

import java.util.*;

public class combinations {

   static  List<Integer>l1=new ArrayList<>();
    static ArrayList<List<Integer>>l2= new ArrayList<>();
    public static void main(String[] args) {
        ;
        combination(2,4);

        for(List x : l2){
            System.out.println(x);
        }
    }

    public static void combination(int k , int n){

        comb(3,4,1);

    }

    


    public static  void comb(int k , int n,int index){


       if(l1.size()==k){
           if(conatains()){
               l2.add(new ArrayList<>(l1));
               return ;
           }
//           l2.add(new ArrayList<>(l1));
           return;
       }

        for (int i = index; i <=n ; i++) {
            if(l1.contains(i)){
                continue;
            }
            l1.add(i);
            comb(k,n,index+1);
            l1.remove(l1.size()-1);
        }



    }

    public static  boolean conatains(){
        List<Integer>l3=new ArrayList<>(l1);
        Collections.reverse(l3);
    if(!l2.contains(l3)){
        return  true;
    }
    return false;
    }



}
