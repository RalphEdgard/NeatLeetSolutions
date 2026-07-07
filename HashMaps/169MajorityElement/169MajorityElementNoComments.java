class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> occurences = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) { occurences.put(nums[i], occurences.getOrDefault(nums[i], 0)+1); } 
      
        int maxVal = 0; 
        for (Map.Entry<Integer, Integer> vals: occurences.entrySet()) { maxVal = Math.max(vals.getValue(), maxVal); }

        int returnValue = 0;
        for (Map.Entry<Integer, Integer> vals: occurences.entrySet()) { if (maxVal == vals.getValue()) returnValue = vals.getKey(); }
      
        return returnValue; 
    }
}
