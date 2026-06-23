class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++){
            int key = nums[i]; // treating key as the value 
            map.put(key, map.getOrDefault(key,0) + 1); // incrementing count .
            if (map.get(key) > 1){
                return true;
            }
        }
        return false;
    }
}