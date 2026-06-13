class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1=0;
        int p2=numbers.length-1;
        int[] result = new int[2];
        while(p1<p2){
            int sum = numbers[p1] + numbers[p2];
            if(sum>target){
                p2--;
            }
            else if(sum < target){
                p1++;
            }
            else if (sum==target){
                result[0] = p1+1;
                result[1] = p2+1;
                break;
            }
        }
        return result;
    }
}
