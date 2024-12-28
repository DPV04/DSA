// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
class HelloWorld {
    static List<Integer>l1 =new ArrayList<>();
    static Set<List<Integer>>l2=new HashSet<>();
    static int index=0;
   
    
    public static void main(String[] args) {
        int [] nums={1,2,3};
        int l=0;
        int r=nums.length-1;
        recursion(nums,index,l,r);
        for(List<Integer> x:l2){
            System.out.println(x);
        }
    }
    
    public static void recursions(int [] nums,int index,int l,int r){
        if(nums.length==index){
            l2.add(new ArrayList<>(l1));
            swap(nums,l,r);
        }
        l1.add(nums[index]);
        dfs(nums,index+1,l,r);
    }
    
    public static void swap(int [] nums,int l, int r){
        if(l==nums.length|| r==-1){
            return;
        }
        int swap=nums[l];
        nums[l]=nums[r];
        nums[r]=swap;
        l++;
        r--;
        
    }
}