class Solution {
    // HimanshuSingh924
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int maxNum = -1;

		for(int num : arr){
			map.put(num, map.getOrDefault(num,0)+1);	
		}

		for (Map.Entry<Integer, Integer> entryMap : map.entrySet()){
			if (entryMap.getKey().equals(entryMap.getValue())){
                maxNum = Math.max(maxNum, entryMap.getKey());
            }
		}

		return maxNum;
    }
}