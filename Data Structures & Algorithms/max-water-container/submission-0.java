class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(left<right){
            int area = (right-left) * (Math.min(heights[left],heights[right]));
            if(area>maxArea){
                maxArea = area;
            }
            if(heights[left]>=heights[right]){
                right--;
            }
            else if(heights[left]<heights[right]){
                left++;
            }
        }
        return maxArea;

    }
}
