class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> main  = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); 
            }

            else if (ch == '[') {
                count.push(k);
                main.push(current);

                current = new StringBuilder();
                k = 0;
            }

            else if (ch == ']') {
                int repeat = count.pop();
                StringBuilder prev = main.pop();

                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }

                current = prev;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}