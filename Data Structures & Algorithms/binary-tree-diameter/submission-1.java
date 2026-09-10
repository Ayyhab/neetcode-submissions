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
    public int diameterOfBinaryTree(TreeNode root) {
    if (root==null){
        return 0;
    }

    int right_height = 1;
    int left_height = 1;

    right_height  = height(root.right) ;
    left_height  = height(root.left);

    int diameter= right_height + left_height;
   int diam_right= diameterOfBinaryTree(root.right);
    int diam_left = diameterOfBinaryTree(root.left);

    if( diameter < diam_right){
        diameter= diam_right;
    }
    if (diam_left > diameter){
        diameter = diam_left;
    }
    
    return diameter;

    }

    public int height(TreeNode root){
         if (root==null){
            return 0;
        }
        int height = 1+ Math.max(height(root.right), height(root.left));
    
        return height;
    }


}
