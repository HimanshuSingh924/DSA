class Solution {

    // HimanshuSingh924
    public int lengthOfLastWord(String s) {
        int ans = s
                .split("\\s+")[s.split("\\s+").length-1]
                .length();

        return ans;
    }
}