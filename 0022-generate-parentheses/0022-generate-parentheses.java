class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    private void backTrack(List<String> ans, StringBuilder str, 
        int open, int close, int n){
        if(str.length() == 2*n){
            ans.add(str.toString());
            return;
        }

        if(open < n){
            str.append('(');
            backTrack(ans, str, open + 1, close, n);
            str.deleteCharAt(str.length()-1);
        }

        if(close < open){
            str.append(')');
            backTrack(ans, str, open, close + 1, n);
            str.deleteCharAt(str.length()-1);
        }
    }
}