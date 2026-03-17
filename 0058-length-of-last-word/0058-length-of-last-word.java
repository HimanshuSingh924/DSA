class Solution {

    // HimanshuSingh924
    public int lengthOfLastWord(String s) {
        
        String[] str = s.split("\\s+");
        
        String lastWord = str[str.length-1];

        int length = lastWord.length();

        return length;
    }
}