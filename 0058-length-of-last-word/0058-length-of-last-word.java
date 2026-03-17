class Solution {

    // HimanshuSingh924
    public int lengthOfLastWord(String s) {
        
        String[] str = s.split("\\s+");
        
        int ans = str[str.length-1].length();

        return ans;
    }
}