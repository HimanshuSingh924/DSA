class Solution {

    // HimanshuSingh924
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			str[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(str, (s1,s2)->(s1+s2).compareTo(s2+s1));

        if (str[str.length - 1].equals("0")) {
            return "0";
        }

		StringBuilder strb = new StringBuilder();
		for (int i = str.length-1; i >= 0; i--)
		{
			strb.append(str[i]);
		}

		return strb.toString();
    }
}