class Solution {
    // HimanshuSingh924
    public boolean isPalindrome(String s) {

        if(s.length() == 1) return true;
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

		int start = 0, end = sb.length()-1;
		while (start < end)
		{
			if (sb.charAt(start) != sb.charAt(end))
			{
				return false;
			}
            start++;
            end--;
		}

        return true;
    }
}