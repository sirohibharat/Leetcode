class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> cummalativeSum= new HashMap<>();
        cummalativeSum.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(cummalativeSum.containsKey(sum-k)){
                count += cummalativeSum.get(sum - k);
            }
            cummalativeSum.put(sum, cummalativeSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}