class Solution {
    public String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        int count = 0;
        int idx = 0;

        for (char c : chars) {
            if (c == '(') {
                if (count > 0) {
                    result[idx++] = c;
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result[idx++] = c;
                }
            }
        }

        return new String(result, 0, idx);
    }
}