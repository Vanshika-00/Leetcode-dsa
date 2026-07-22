class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;

        


        for(int ele : nums){

            curSum+=ele;

            maxSum = Math.max(maxSum,curSum);

            if(curSum<0)  curSum=0;

        }
        return maxSum;
        
    }
}