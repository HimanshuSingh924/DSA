class Solution {

    // HimanshuSingh924
    public int lengthOfLastWord(String s) {
        
        // String[] str = s.split("\\s+");
        
        // String lastWord = str[str.length-1];

        // int length = lastWord.length();

        // return length;

        String[] word = java.util.Arrays
							.stream(
								s.trim()
								 .split("\\s+"))
							.toArray(
								String[]::new);

		System.out.println(java.util.Arrays.toString(word));

		int length = word[word.length-1].length();
		
		System.out.println(length);

        return length;
    }
}