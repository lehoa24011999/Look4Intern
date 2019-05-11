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
    List<String> out = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {
            if(root == null) return out;
            recur(root, "" + root.val);
            return out;
        }

        public void recur(TreeNode node, String s){
            if(node.left == null && node.right == null) out.add(s);
            if(node.left != null) recur(node.left, s + "->" + node.left.val);
            if(node.right != null) recur(node.right, s + "->" + node.right.val);
        }

}