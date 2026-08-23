class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            
            // Check if the current digit is odd
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        return "";
    }
}