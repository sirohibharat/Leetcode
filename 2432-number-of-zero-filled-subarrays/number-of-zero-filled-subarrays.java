class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int l=0;
            if(nums[i]==0){
                while(i<n && nums[i]==0){
                    i++;
                    l++;
                }
                result += (long)l * (l + 1) / 2;
                i--;
            }
        }
        return result;
    }
}