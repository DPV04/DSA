package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class DFS extends BinarySearchTree {
    List<String>l1=new ArrayList<>();


    public List<String> binaryTreePaths() {
        l1=binaryTreePathshelper(root);
        return l1;
    }
    public List<String> binaryTreePathshelper(BinaryTreeNode root) {
        if(root==null){
            return l1;
        }
        l1.add(String.valueOf(root.data));
        binaryTreePathshelper(root.left);
        binaryTreePathshelper(root.right);

        return l1;

    }












}
