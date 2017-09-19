package org.yzy.nowcoder;

import java.util.Stack;

/**
 * Created by yangzhiyue on 17-9-19.
 */
public class N8 {
    class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public int TreeDepth(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}
