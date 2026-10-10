class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(index.containsKey(complement)){

                result[0] = index.get(complement);
                result[1] = i;

                return result;
            }

            index.put(nums[i], i);
        }

        return result;
    }
}
