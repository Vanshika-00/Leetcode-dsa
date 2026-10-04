class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int count=0;
        int gcount=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;

                if(gcount<count) gcount=count;
            }

           else count=0;
        }
       
       
        return gcount;
    }
}