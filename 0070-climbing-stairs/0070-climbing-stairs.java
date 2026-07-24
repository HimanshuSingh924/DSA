class Solution {
    public int climbStairs(int n) {
        if(2 >= n) return n;
        
        // return climbStairs(n-1) + climbStairs(n-2);

        int step1 = 1;
        int step2 = 2;

        for(int i = 3; i <= n; i++){
            int curr = step1 + step2;
            step1 = step2;
            step2 = curr;
        }

        return step2;
    }
}