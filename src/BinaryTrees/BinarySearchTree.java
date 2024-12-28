package BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTree {

    BinaryTreeNode root;


    public void  insert(BinaryTreeNode node){
       root=inserthelper(node,root);
        
    }

    public void insertionleft(BinaryTreeNode node ){
       root=insertleft( node, root);
    }

    public void insertionright(BinaryTreeNode node ){
        root=insertright( node, root);
    }

    private BinaryTreeNode insertright(BinaryTreeNode node , BinaryTreeNode subroot ){
        if(subroot==null){
            subroot=node;
        }else {
            subroot.right = insertright(node, subroot.right);
        }
        return subroot;
    }


    private BinaryTreeNode insertleft(BinaryTreeNode node , BinaryTreeNode subroot ){
       if(subroot==null){
           subroot=node;
       }else {
           subroot.left = insertleft(node, subroot.left);
       }
      return subroot;
    }

    private BinaryTreeNode inserthelper(BinaryTreeNode node,BinaryTreeNode root){
        int data=node.data;
        
        if(root==null){
            root=node;
        } else if (data>root.data) {
            root.right=inserthelper(node,root.right);
        }
        else {
            root.left=inserthelper(node, root.left);
        }

        return root;
    }




    public  void display(){
       displayhelper(root);
    }

    private void displayhelper(BinaryTreeNode root){
        if(root!=null){
            displayhelper(root.left);
            System.out.println(root.data);
            displayhelper(root.right);
        }
    }

    public ArrayList<Integer>preorderTraversal(){
        ArrayList<Integer>arr=new ArrayList<Integer>();
        if(root==null){
            return arr;
        }
        Stack<BinaryTreeNode>st=new Stack<>();
        st.push(root);
        while(!st.empty()){
            BinaryTreeNode nod = st.pop();
            arr.add(nod.data);

            if(nod.right!=null){
                st.push(nod.right);
            }
            if(nod.left!=null){
                st.push(nod.left);
            }
        }
        return arr;
    }
    public ArrayList<Integer>inorder(){
        ArrayList<Integer>arr=new ArrayList<>();
        BinaryTreeNode temp=root;
        Stack<BinaryTreeNode>st=new Stack<>();

//        boolean b=false;

        while(!st.empty()){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else {

                temp = st.pop();
                arr.add(temp.data);
                temp = temp.right;


            }


        }
        return arr;
    }




        public  ArrayList<Integer> postorder( ){
        BinaryTreeNode curr = root;
        ArrayList<Integer>arr=new ArrayList<>();
        Stack<BinaryTreeNode>st=new Stack<>();
        BinaryTreeNode temp=null;

         while(curr!=null || !st.empty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                temp=st.peek().right;
                if(temp==null){
                    temp=st.peek();
                    st.pop();
                    arr.add(temp.data);
                    while(st.isEmpty() && temp==st.peek().right){
                        temp=st.peek();
                        st.pop();
                        arr.add(temp.data);
                    }

                }
                else {
                    curr=temp;
                }
            }
         }
         return arr;
       }

}
