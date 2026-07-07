class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { values.put(nums[i], values.getOrDefault(nums[i],0) + 1); }
        for (Map.Entry<Integer,Integer> vals: values.entrySet()) { if (vals.getValue() > 1) return true; }
        return false; 
    }
}
