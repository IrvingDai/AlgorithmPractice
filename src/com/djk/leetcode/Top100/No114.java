package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/11/10 20:29
 */
public class No114 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }

    TreeNode temp = null;

    public void flatten(TreeNode root) {
        if(root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.left = null;
        root.right = temp;
        temp = root;



    }

    public void preorder(TreeNode node){

        if(node == null)
            return;


        preorder(node.left);
        preorder(node.right);

    }
}
