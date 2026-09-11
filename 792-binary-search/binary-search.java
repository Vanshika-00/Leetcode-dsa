class Solution {
    public int search(int[] arr, int target) {

        int lo=0;
        int n = arr.length;
        int hi=n-1;

        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target) hi=mid-1;
            if(arr[mid]<target) lo=mid+1;
            if (arr[mid] ==target) return mid;

        }
        return -1;
    }
}