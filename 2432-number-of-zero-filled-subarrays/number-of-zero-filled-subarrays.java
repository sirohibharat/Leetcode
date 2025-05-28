class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int n = nums.length;
        int i = 0;
        while(i < n) {
            if(nums[i] == 0) {
                int l = 0;
                while(i < n && nums[i] == 0) {
                    i++;
                    l++;
                }
                result += (long)l * (l + 1) / 2;
            } else {
                i++; 
            }
        }
        return result;
    }
}