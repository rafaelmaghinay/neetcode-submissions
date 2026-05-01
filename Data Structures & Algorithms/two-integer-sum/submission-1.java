class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairMap = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int pair = target - nums[i];

            if (pairMap.containsKey(pair)){
                return new int[]{pairMap.get(pair), i};
            }
            pairMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
