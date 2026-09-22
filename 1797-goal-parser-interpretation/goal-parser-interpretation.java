class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < command.length()) {
            char c = command.charAt(i);

            if (c == 'G') {
                sb.append('G');
                i++;
            } else if (c == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i += 2; 
            } else { 
                sb.append("al");
                i += 4; 
            }
        }

        return sb.toString();
    }
}