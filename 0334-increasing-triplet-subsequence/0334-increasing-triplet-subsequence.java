class Solution {
    // HimanshuSingh924
    public boolean increasingTriplet(int[] nums) {
        int i = 0;
		int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
		
		while (i < nums.length)
		{
			if (nums[i] <= a)    a = nums[i];
			else if (nums[i] <= b)	b = nums[i];
			else
			{
				c = nums[i];
				return true;
			}

			i++;
		}
		return false;    
    }
}