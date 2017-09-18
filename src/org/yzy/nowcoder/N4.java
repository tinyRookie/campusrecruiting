package org.yzy.nowcoder;

/**
 * Created by yangzhiyue on 17-9-17.
 */


class TreeLinkNode{
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next  = null;
    TreeLinkNode(int val){
        this.val = val;
    }
}

public class N4 {
    StringBuffer sb = new StringBuffer();
    TreeLinkNode target ;
    private void inOrder(TreeLinkNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        if(node == target){
            sb.append('A');
        }else{
            sb.append(node.val);
        }
        inOrder(node.right);
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        TreeLinkNode temp = pNode;
        TreeLinkNode root = null;
        target = pNode;
        while(temp != null){
            root = temp;
            temp = temp.next;
        }
        this.inOrder(root);
        String result = sb.toString();
        for(int i = 0; i< result.length();i++){

        }
        return null;
    }
}
