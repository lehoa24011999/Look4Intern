/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int[] n;
    public TreeNode sortedArrayToBST(int[] nums) {
        n = nums;
        return helper(0, nums.length);
    }

    private TreeNode helper(int left, int right) {
        if(left == right) {
            return null;
        }
        int r = left + (right-left)/2;
        TreeNode root = new TreeNode(n[r]);
        root.left = helper(left, r);
        root.right = helper(r+1, right);
        return root;
    }
}