class Solution {

    // HimanshuSingh924
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
		StringBuilder sb = new StringBuilder("");
		for (int i = str.length-1; i >= 0; i--){
			sb.append(str[i]+" ");
		}

		return sb.toString().trim();
    }
}