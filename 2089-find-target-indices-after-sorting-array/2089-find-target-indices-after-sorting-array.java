class Solution {

    // HimanshuSingh924
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
 		
		int less = 0;
		int equal = 0;

		for (int num : nums){
			if (num < target)   less++;
			else if (num == target)     equal++;
		}

		for (int i = 0; i < equal; i++){
			list.add(less + i);
		}

		return list;
    }
}