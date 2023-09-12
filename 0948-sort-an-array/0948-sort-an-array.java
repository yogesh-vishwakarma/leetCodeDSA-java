class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int e:nums) pq.add(e);
        for(int i=0;i<nums.length;i++) nums[i]=pq.poll();
        return nums;
    }
}