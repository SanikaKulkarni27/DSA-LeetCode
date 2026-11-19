class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> nz = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nz.add(nums[i]);
            }
        }
        for(int i=0; i<n; i++){
            if(i<nz.size()){
            nums[i] = nz.get(i);
            }
            else{
            nums[i] = 0;
            }
        }
    }
}