class Solution {
    public int[] twoSum(int[] nums, int target) {
         for(int i=0; i<nums.length; i++){ // selecting the first number
            for(int j=i+1 ; j<nums.length; j++){ // selecting the second number
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{};
        
    }
}