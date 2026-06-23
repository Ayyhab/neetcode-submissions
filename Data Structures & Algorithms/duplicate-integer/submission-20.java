class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // only used for checking if a value exists or not unlike a hashmap(key , value)
        for (int i =0; i < nums.length ; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

        }
        return false;
    }
}