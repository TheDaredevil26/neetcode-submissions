class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int p1 = i;
            int p2 = i + 1;
            int p3 = nums.length - 1;
            while (p2 < p3) {
                int sum = nums[p1] + nums[p2] + nums[p3];

                if (sum == 0) {
                    result.add(Arrays.asList(
                        nums[p1],
                        nums[p2],
                        nums[p3]
                    ));

                    while (p2 < p3 && nums[p2] == nums[p2 + 1]) {
                        p2++;}

                    while (p2 < p3 && nums[p3] == nums[p3 - 1]) {
                        p3--;}
                    
                    p2++;
                    p3--;
                }
                else if (sum < 0) {
                    p2++;
                }
                else {
                    p3--;
                }
            }
        }

        return result;
    }
}