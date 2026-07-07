class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != number) break; 
            number++;
        }
        return number;
    }
}
