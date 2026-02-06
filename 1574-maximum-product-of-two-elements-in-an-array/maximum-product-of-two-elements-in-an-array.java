class Solution {
    
    // HimanshuSingh924
    public int maxProduct(int[] nums) {
		int firstMax = -1;
		int secMax = -1;

		for (int i = 0; i < nums.length; i++)
		{
			if (firstMax < nums[i])
			{
				secMax = firstMax;
				firstMax = nums[i];
			}
			else if (secMax < nums[i])
			{
				secMax = nums[i];
			}
		}

		return ((firstMax - 1) * (secMax - 1));
    }
}