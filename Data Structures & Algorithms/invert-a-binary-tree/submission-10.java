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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;// base case: nothing here, stop
        }

        if (root.left!=null && root.right!= null){
        TreeNode temp1 = root.left;
        root.left=root.right;
        root.right= temp1;
        }
        else if(root.left!=null && root.right== null){
            root.right= root.left;
            root.left= null;
        }
        else if(root.right!= null && root.left == null){

            root.left=root.right;
            root.right= null;
        }
    
    System.out.println(root.val);  // do the "work" for this one node

    invertTree(root.left);          // do the same job on the left 
    invertTree(root.right);         // do the same job on the right 
    return root;
    }
}          

    

