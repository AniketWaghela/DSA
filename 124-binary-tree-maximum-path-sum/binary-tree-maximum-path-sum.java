/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        height(root);
        return ans;
    }
    private int height(TreeNode root ){
        if( root == null) return 0;

        // System.out.println("hello");
        int lh = Math.max(height(root.right),0);
        int rh = Math.max(height(root.left),0);

        ans =  Math.max(ans ,root.val+lh+rh);

        return root.val + Math.max(lh,rh);
    }
}