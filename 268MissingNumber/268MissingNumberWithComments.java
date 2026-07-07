class Solution {
    public int missingNumber(int[] nums) {
        // from what i understand we need to return what is the missing number 
        // it seems like we can solve this with an array easily rather than using map
        // let me see if i can try to solve it with array first 

        // sort it first 
        Arrays.sort(nums);
        // we can then get the last number in the array to see what is the expected size but if you see in the list below the last number is 1 not 2 
        // and if we get the size of the array it makes sense in case 2 but not case 1 or 3 or maybe its me being silly, i am silly 
        // so far the states we need to create is a variable that increments so that we increase the value as the iterations pass by 
        // this could be one way we can catch a mismatch, we would probably have an edge case 
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i] + " " + number + " " + (nums[i] == number++));
            if (nums[i] != number)
                break; // means we have found the mismatch and we can stop yes for the first exmaple 2 and 3 are the mismatches 
            number++;
        }

        return number; // i wanted fisrt place !!! but let me show you the code and how short a solution could be without these comments 
        // the solution could be smaller or more clever, i just cant really wrap my head around doing it with map or hashtable
    }
}
