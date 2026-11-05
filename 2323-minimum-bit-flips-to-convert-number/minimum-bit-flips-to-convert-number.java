class Solution {
    public int minBitFlips(int start, int goal) {

        String binary1 = "";
        String binary2 = "";

        int num1 = start;

        while (num1 > 0) {
            int rem = num1 % 2;
            binary1 = rem + binary1;
            num1 = num1 / 2;
        }

        int num2 = goal;

        while (num2 > 0) {
            int rem = num2 % 2;
            binary2 = rem + binary2;
            num2 = num2 / 2;
        }

        int count = 0;

        int len = Math.max(binary1.length(), binary2.length());

        while (binary1.length() < len) {
            binary1 = "0" + binary1;
        }

        while (binary2.length() < len) {
            binary2 = "0" + binary2;
        }

        for (int i = 0; i < len; i++) {
            if (binary1.charAt(i) != binary2.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}