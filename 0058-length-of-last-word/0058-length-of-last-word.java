class Solution {
    // HimanshuSingh924
    public int lengthOfLastWord(String s) {
        
        System.out.println("s : "+s.toString());

		String str = s.trim();
		System.out.println("Str : "+str.toString());

		int length = 0;
		for (int i = str.length()-1; i >= 0; i--){
			if (str.charAt(i) != ' ') {
				length++;
			}
			else {
				break;
			}
		}

		System.out.println(length);

		return length;
    }
}