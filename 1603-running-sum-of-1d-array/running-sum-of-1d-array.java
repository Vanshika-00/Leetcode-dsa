class Solution {
    public int[] runningSum(int[] arr) {
        int m =arr.length;
        int sum=0;

        for(int i=0;i<m;i++){
            sum=sum+arr[i];
           arr[i]=sum;
        }

        return arr;

        
    }
}