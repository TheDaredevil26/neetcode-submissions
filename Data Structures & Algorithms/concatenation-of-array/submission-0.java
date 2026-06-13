class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i=0; i<len; i++){
            ans[i] = nums[i];
        }
        for(int i=len; i<(2*len); i++){
            ans[i] = nums[i-len];
        }
        return ans;
        
    }
}