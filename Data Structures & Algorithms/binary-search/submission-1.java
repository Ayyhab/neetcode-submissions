class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;//0
        int high = nums.length-1;//5
        
        while( low<=high ){
             int mid = low + (high-low /2);

            if (target > nums[mid]){ // 4>2
                low=mid+1;  // low=nums[3]=4
            }
            else{ //4<6
                high=mid-1;// high = nums[3]=4
            }

        }

       for(int i=0; i< nums.length;i++){
         if( target == nums[i]){
            return low;
        }
       }
    return -1;


    }
}
