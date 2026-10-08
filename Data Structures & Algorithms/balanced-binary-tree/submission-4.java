
class Solution {
    private boolean flag  = true ;

    public boolean isBalanced(TreeNode root) {
// Write a helper that returns the height of a node (null has height 0).
// Inside it, get the left height and the right height.
// If they differ by more than 1, record "not balanced" (a boolean flag, or return -1 as a signal).
// Return 1 + max(left, right).

height(root);
return flag;

}


public int height(TreeNode node){

    if (node == null){
        return 0;
    }


    if(node.left == null || node.right == null){

    }
    int left = height ( node.left );
    int right = height (node.right);

    if ( Math.abs(left - right) > 1){
        flag = false;
    }
    return 1+ Math.max(left,right);    

    }
}

