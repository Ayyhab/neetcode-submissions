class Solution {
    public int[] twoSum(int[] nums, int target) {


        for(int j = 0 ; j < nums.length; j++){ // 2,5,5,11
        int num = nums[j];//5
            for ( int i = j+1 ; i < nums.length ;i++){
                if ( num + nums[i] == target){ // 5+5=10.  1,1
                    return new int[] {j,i};
                }
            }
        }

        return new int[nums.length];
    }
}
