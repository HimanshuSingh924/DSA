class Solution {
    // HimanshuSingh924
    public int dominantIndex(int[] nums) {
        int max = -1;
		int secMax = -1;
		int maxIndex = -1;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (max < nums[i])
			{
				secMax = max;
				max = nums[i];
				maxIndex = i;
			}
			else if (secMax < nums[i])
			{
				secMax = nums[i];
			}
		}

		if (secMax * 2 <= max) return maxIndex;

		return -1;
    }
}