// i guess n is even meaning array will always have even lengths
// then we divide half way ? 
// i mean what is the smallest and largest element lol ? its certainly not 1
// oh okay yeah at step 0 15 and 1 added and divided bam we get 8 
// then next 3 and 13 divided boom 2 again and then we get all verages and return the smallest average 
class Solution {
    public double minimumAverage(int[] nums) {
        // needs those values in a ds because if i use the array i will have to find a n^2 solution which is not what i want 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> avgs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) list.add(nums[i]);
        // i am going to traverse infinitely until i remove all the max and min values that i find 
        // when finding a solution you have to think outside the box, you would think ok use 2 for loops or if you figured the ds part maybe you would say ok
        // lets just i dont knwo find a complicated solution, but you need to be clever and find work arounds like what i am doing 
        // which i will explain in a second 
        
        while (true) { // yup just take the max min using collections class and then remove using list method for both and bam
            avgs.add(((Collections.max(list) + Collections.min(list))/2.0));
            list.remove(Collections.max(list));
            list.remove(Collections.min(list));
            if (list.size() == 0) break;
        }
        
        return Collections.min(avgs); // yup not bad, in meta context you need to spend time with code enough to know a lot of methods not all but just enough
        // and spend enough time in leetcode to understand the patterns on how to pick solutions carefully before implementing 
        // this took me hours for one problem but after spending enough time i would start to recognize how i can come up with solutions very quickly 
    }
}
