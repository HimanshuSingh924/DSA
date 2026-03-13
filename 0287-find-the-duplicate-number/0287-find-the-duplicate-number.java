class Solution {
    // HimanshuSingh924
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++)
		{
			int element = nums[i];
			element = Math.abs(element);

			if (nums[element] > 0)
			{
				nums[element] =- nums[element];
			}
			else
			{
				return element;
			}
		}

		return -1;
    }
}