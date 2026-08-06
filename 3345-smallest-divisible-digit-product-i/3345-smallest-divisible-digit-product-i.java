class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitProduct(n) % t == 0){
                return n;
            }
            n++;
        }
    }

    private int digitProduct(int n){
        int pro = 1;
        while(n > 0){
            pro *= n % 10;
            n /= 10;
        }

        return pro;
    }
}   