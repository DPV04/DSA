import BinaryTrees.BinaryTreeNode;
import BinaryTrees.DFS;

public class Main {
    public static void main(String[] args) {

       DFS binary = new DFS();

//        binary.insertionleft(new BinaryTrees.BinaryTreeNode(10));
//        binary.insertionright(new BinaryTrees.BinaryTreeNode(5));
//        binary.insertionleft(new BinaryTrees.BinaryTreeNode(4));
//        binary.insertionright(new BinaryTrees.BinaryTreeNode(7));
//        binary.insertionright(new BinaryTrees.BinaryTreeNode(14));
        binary.insert(new BinaryTreeNode(10));
        binary.insert(new BinaryTreeNode(4));
        binary.insert(new BinaryTreeNode(15));
        binary.insert(new BinaryTreeNode(5));
        binary.insert(new BinaryTreeNode(3));
        for(String x:binary.binaryTreePaths()){
            System.out.println(x);
        }



//        binary.display();
    }
}