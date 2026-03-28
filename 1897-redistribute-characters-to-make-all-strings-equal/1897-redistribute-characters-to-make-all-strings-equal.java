class Solution {

    // HimanshuSingh924
    public boolean makeEqual(String[] words) {
        int sizeOfArray = words.length;
		Map<Character, Integer> map = new HashMap<>();
		
		StringBuilder sb = new StringBuilder("");

		for (String str : words) {
			sb.append(str);
		}

		for (char ch : sb.toString().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

		for (int count : map.values()) {
			if (count % sizeOfArray != 0) {
				return false;
			}
		}

		return true;
    }
}