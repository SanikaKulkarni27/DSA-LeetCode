class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double [] at = new double[n];

        for(int i=0; i<n; i++){
            at[i] = (double) dist[i]/speed[i];
        }
        Arrays.sort(at);

        int count = 0;

        for(int i=0; i<n; i++){
            if(at[i] <= i){
                break;
            }
            count++;
        }
        return count;
    }
}