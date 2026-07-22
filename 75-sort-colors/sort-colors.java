class Solution {

    public void swap (int[] arr , int mid, int lo){
        int temp=arr[mid];
        arr[mid]=arr[lo];
        arr[lo]=temp;
    }

    public void sortColors(int[] arr) {

        int n = arr.length;
        int lo=0;
        int mid=0;
        int high=n-1;

        while (mid<=high) { 
            if(arr[mid]==0){
                swap(arr,lo,mid);
                lo++;
                mid++;
            }
            else if(arr[mid]==1) {
                mid++;
            }
            else { // arr[mid]==2
                swap(arr,mid,high);
                high--;
            }
        } 
    }
}