class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int data = nums[i];
            if(counter.containsKey(data)){
                return true;
            }
            counter.put(data, counter.getOrDefault(data, 0)+1);
        }
        return false;
    }
}