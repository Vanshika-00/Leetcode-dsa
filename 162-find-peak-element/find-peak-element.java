class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // Edge Case: If the array has only 1 element, it's automatically a peak
        if (n == 1) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            // Check for the first element: only needs to be greater than the right neighbor
            if (i == 0) {
                if (nums[0] > nums[1]) {
                    return 0;
                }
            }
            // Check for the last element: only needs to be greater than the left neighbor
            else if (i == n - 1) {
                if (nums[n - 1] > nums[n - 2]) {
                    return n - 1;
                }
            }
            // Check for middle elements: must be strictly greater than both neighbors
            else {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    return i;
                }
            }
        }

        return -1;
    }
}