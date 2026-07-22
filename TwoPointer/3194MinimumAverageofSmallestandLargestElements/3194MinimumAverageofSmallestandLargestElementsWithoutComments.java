class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> avgs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) list.add(nums[i]);
        
        while (true) {
            avgs.add(((Collections.max(list) + Collections.min(list))/2.0));
            list.remove(Collections.max(list));
            list.remove(Collections.min(list));
            if (list.size() == 0) break;
        }
        
        return Collections.min(avgs);
    }
}
