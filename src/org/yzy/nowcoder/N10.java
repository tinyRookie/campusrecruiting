package org.yzy.nowcoder;

import java.util.Stack;

/**
 * Created by yangzhiyue on 17-9-19.
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}

class Node{
    TreeNode node;
    boolean isFirst;
    public Node(TreeNode node){
        this.node = node;
    }
}




public class N10 {
    static void postOrder(TreeNode root){
        Stack<Node> stack = new Stack<Node>();
        TreeNode temp = root;
        while(temp != null || !stack.isEmpty()){
            //System.out.println(temp.val);
            while(temp != null){
                Node node = new Node(temp);
                node.isFirst = false;
                stack.push(node);
                temp = temp.left;
            }
            Node top = stack.pop();
            if (!top.isFirst){
                top.isFirst = true;
                stack.push(top);
                temp = top.node.right;
            }else{
                System.out.println(top.node.val);
            }
        }
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        postOrder(root);
    }
}
