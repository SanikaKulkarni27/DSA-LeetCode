class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for (int num : arr1) {
            count[num]++;
        }

        int idx = 0;

        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[idx++] = num;
                count[num]--;
            }
        }

        for (int val = 0; val <= 1000; val++) {
            while (count[val] > 0) {
                arr1[idx++] = val;
                count[val]--;
            }
        }

        return arr1;
    }
}