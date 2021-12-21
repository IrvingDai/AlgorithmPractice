package com.djk.leetcode.SwordOffer;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/18 22:12
 */
public class Offer26 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    boolean res = false;

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        if(A.val == B.val)
            return dfs(A, B);
        return isSubStructure(A.right, B) || isSubStructure(A.left, B);
    }

    public boolean dfs(TreeNode A, TreeNode B) {
        if(B == null){
            //res = true;
            return true;
        }
        if(A == null)
            return false;

        if(A.val == B.val){
            return dfs(A.left, B.left) || dfs(A.right, B.right);
        }else{
            return false;
        }
    }
}
