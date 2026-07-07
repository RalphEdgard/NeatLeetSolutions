class Solution {
    public int majorityElement(int[] nums) {
        // nums particular size the majority element apprars more than n/2 (more than the size of the array ? )
        // that vallue is what appears most in the array therefore its what occurs most frequently 

        // there is a strategy with hashmaps or hashsets where you can keep track of the amount of times something occurs 
        // that is something that you have to remember frequently, dont forget come back to the problem after a few days 

        // i found this solution because of chatgpt when i was in another conutry preparing for an interview but i always practiced the same problem 
        // remember the methods which i did forget 
        Map<Integer, Integer> occurences = new HashMap<>(); // to keep count of each number 

        // traverse through each so that we can take not of a number that is unique or not and then store that in the map 
        // we put nums[i] and the 2nd arg checks to see if its there if it is not put 0 if it is we increment
        for (int i = 0; i < nums.length; i++) { occurences.put(nums[i], occurences.getOrDefault(nums[i], 0)+1); } 

        // now we traverse through the map to see which one has the highest value 
        int maxVal = 0; 
        // maxVal used to simply be compared to the first value which is 1 then at 2 we compare to 1 which means 2 > 1
        for (Map.Entry<Integer, Integer> vals: occurences.entrySet()) { maxVal = Math.max(vals.getValue(), maxVal); }

        // for the below there was probably a faster way to do it or the below was not necessary but this was the best i could come up with logically
        int returnValue = 0;
        for (Map.Entry<Integer, Integer> vals: occurences.entrySet()) { if (maxVal == vals.getValue()) returnValue = vals.getKey(); }
        return returnValue; 
    }
}
