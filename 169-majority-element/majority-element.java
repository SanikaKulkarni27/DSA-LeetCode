class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            // When count reaches 0, choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increment count if same as candidate, otherwise decrement
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}