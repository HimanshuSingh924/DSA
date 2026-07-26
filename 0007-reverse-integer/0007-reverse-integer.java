class Solution {
    public int reverse(int x) {
        //if(x > 0){
            return reverseInt(x);
        // }else if(x < 0){
        //     return reverseInt(x * -1);
        // }else{
        //     return x;
        // }
    }

    private int reverseInt(int x){
        // if(x == 0) return 0;

        long rev = 0;

        while(x != 0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)rev;
    }
}   