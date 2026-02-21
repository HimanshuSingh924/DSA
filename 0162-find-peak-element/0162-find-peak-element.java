class Solution {
    // HimanshuSingh924
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)	return 0;
		else if (nums[0] > nums[1]) return 0;
		else if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length-1;
		
		int start = 1;
		int end = nums.length - 2;

		int mid;
		while (start <= end){
			mid = start + (end - start) / 2;

			if (nums[mid - 1] > nums[mid])	end = mid - 1;
			else if (nums[mid] < nums[mid + 1])  start = mid + 1;
			else	return mid;
		
        }
        return start;
    }
}