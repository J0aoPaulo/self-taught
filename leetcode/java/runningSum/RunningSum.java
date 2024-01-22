package runningSum;

class RunningSum {
    public int[] runningSum(int[] nums) {
        int pos1 = nums[0];
        int pos2 = nums[1];
        int before = pos1 + pos2;

        nums[1] = before;

        for (int i = 2; i < nums.length; i++) {
            nums[i] += before;
            before = nums[i];
        }
        return nums;
    }
}