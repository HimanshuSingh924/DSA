class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        backTrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void backTrack(int[] arr, int target, int start, List<Integer> curr, List<List<Integer>> ans){
        if(0 == target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < arr.length; i++){
            if(i > start && arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }

            curr.add(arr[i]);

            backTrack(arr, target - arr[i], i + 1, curr, ans);

            curr.remove(curr.size() - 1);
        }
    }
}