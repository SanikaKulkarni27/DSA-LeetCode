class Solution {
    public int maxDepth(String s) {
         int depth = 0;
        int maxi = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                depth++;
            }
            else if(s.charAt(i) == ')'){
                depth--;
            }
            maxi = Math.max(depth, maxi);
        }
        return maxi;
    }
}