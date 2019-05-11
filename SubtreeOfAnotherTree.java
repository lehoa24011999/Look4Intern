
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
            if (s == null || t == null) return false;
            boolean res = false;
            if (s.val == t.val) res = res || helper(s, t);
            return res || isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        private boolean helper(TreeNode s, TreeNode t) {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;
            return s.val == t.val && helper(s.left, t.left) && helper(s.right, t.right);
        }
}