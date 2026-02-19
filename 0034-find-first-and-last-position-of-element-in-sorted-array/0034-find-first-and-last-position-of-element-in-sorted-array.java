class Solution {
    // HimanshuSingh924
    public int[] searchRange(int[] nums, int target) {
        int first = firstAndLastAccerence(nums, target, true);
		int last = firstAndLastAccerence(nums, target, false);
		
		return new int[] {first, last};
    }

    private static int firstAndLastAccerence(int[] nums, int target, boolean isFirst){
		int start = 0;
		int end = nums.length - 1;

		int ans = -1;

		while (start <= end){
			int mid = start + (end - start) / 2;

			if (target > nums[mid])	start = mid + 1;
			else if (target < nums[mid])	end = mid - 1;
			else{
				ans = mid;
				
				if (isFirst) end = mid - 1;
				else start = mid + 1;
			}
		}

		return ans;
	}
}