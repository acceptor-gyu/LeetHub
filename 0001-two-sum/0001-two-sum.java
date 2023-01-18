class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int partner = map.get(nums[i]);

                int[] res = {i, partner};
                return res;
            }
            map.put(target - nums[i], i);
        }

        System.out.println("솔루션이 없는 경우");
        return new int[]{};
    }
}