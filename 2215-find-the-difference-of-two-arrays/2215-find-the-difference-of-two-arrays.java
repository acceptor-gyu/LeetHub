class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();
        
        for (int num : nums1) {
            nums1Set.add(num);
        }
        
        for (int num : nums2) {
            nums2Set.add(num);
        }
        
        for (int num : nums2) {
            if (nums1Set.contains(num)) {
                nums1Set.remove(num);
            }
        }
        
        for (int num : nums1) {
            if (nums2Set.contains(num)) {
                nums2Set.remove(num);
            }
        }
        
        List<Integer> nums1List = new ArrayList<>();
        for (int num : nums1Set) {
            nums1List.add(num);
        }
        
        List<Integer> nums2List = new ArrayList<>();
        for (int num : nums2Set) {
            nums2List.add(num);
        }
        
        answer.add(nums1List);
        answer.add(nums2List);
        
        return answer;
    }
}