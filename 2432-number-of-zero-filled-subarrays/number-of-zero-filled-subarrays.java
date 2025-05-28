class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        int count=0;
        long total=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
                total+=count;
            }else{
                count=0;
            }
        }
        return total;
        }
    }
