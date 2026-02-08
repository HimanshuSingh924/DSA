class Solution {

    // HimanshuSingh924
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int ptr = nums.length - 1;

        while(start <= end){
            int startSqr = nums[start] * nums[start];
            int endSqr = nums[end] * nums[end];

            if(startSqr > endSqr){
                arr[ptr] = startSqr;
                start++;
            }
            else{
                arr[ptr] = endSqr;
                end--;
            }
            ptr--;
        }
        return arr;
    }
}