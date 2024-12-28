package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs extends BinarySearchTree{
    List<List<Integer>>l1=new ArrayList<>();


    public List<List<Integer>> bfs(){
        l1=BfsHelper(root);
        return l1;
    }

    public List<List<Integer>> BfsHelper(BinaryTreeNode root){
     Queue<BinaryTreeNode> q1 = new LinkedList<>();

        q1.add(root);

        while(!q1.isEmpty()){
//            if(q1.element()==null){
//                return l1;
//            }
            List<Integer>l2=new ArrayList<>();
            int size = q1.size();

            for (int i = 0; i < size; i++) {
                BinaryTreeNode node =q1.poll();

                if(!(node.left ==null)){
                    q1.add(node.left);
                }
                if(!(node.right ==null)){
                    q1.add(node.right);
                }
                l2.add(node.data);

            }
            l1.add(new ArrayList<>(l2));

        }
        return l1;
    }





}
