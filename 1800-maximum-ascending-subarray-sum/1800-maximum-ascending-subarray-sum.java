class Solution {
    // HimanshuSingh
    public int maxAscendingSum(int[] nums) {
        
		List<Integer> list = new ArrayList<>();

		int sum = nums[0];
		
		int j = 0;
		list.add(j, sum);

		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] > nums[i-1])
			{
				sum += nums[i];
				list.set(j, sum);
			}
			else
			{
				sum = nums[i];
				j++;
				list.add(sum);
			}
		}
		
		return java.util.Collections.max(list);
    }
}