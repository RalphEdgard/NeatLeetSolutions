class Solution {
    public boolean containsDuplicate(int[] nums) {
        // return true if any value appears more than once 
        // false if all are unique 

        // yeah this is a counting problem, so i think we can just use map to keep track of counts 
        // if all are one we are happy if not then we can complain which is the exception

        Map<Integer,Integer> values = new HashMap<>();
        // we traverse to start to keep track of counts, you can take an example from the solution 
        // 169MajorityElement in leetcode 
        // but to recap we traverse and put the element and check to see if its there with getOrDefault
        // if its not there then we can assign it 0 by default and increment to keep track properly
        for (int i = 0; i < nums.length; i++) { values.put(nums[i], values.getOrDefault(nums[i],0) + 1); }

        // i think the next for loop should just return true if we do encounter keys whose values are more than 1 
        for (Map.Entry<Integer,Integer> vals: values.entrySet()) { if (vals.getValue() > 1) return true; }

        // we just use a map to then traverse through the array to get the occurences and assign them to their right keys and traversed the map to find any dups

        // there is probably a better solution since i am using map 
        return false; 
    }
}
