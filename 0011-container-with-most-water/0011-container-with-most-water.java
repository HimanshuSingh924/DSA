class Solution {
    // HimanshuSingh924
    public int maxArea(int[] height) {
        
        int start = 0;
		int end = height.length - 1;

		int maxCapacity = 0;
		
		while (start < end)
		{
			int h = Math.min(height[start], height[end]);
			int width = end - start;

			int currCap = h * width;

			maxCapacity = Math.max(currCap, maxCapacity);

			if (height[start] < height[end]) start++;
			else end--;
			
		}
			
		return maxCapacity;
    }
}