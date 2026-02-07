class Solution {

    // HimanshuSingh924
    public int missingNumber(int[] nums) {
        // int n = nums.length;

        // int expectedSum = (n * (n + 1))/2;

        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        // return expectedSum - actualSum;
        return ((nums.length * (nums.length + 1))/2) - actualSum;
    }
}