class Solution {
    public int missingNumber(int[] nums) {
        int size  = nums.length ;
        int expect = size * (size+1)/2;
         int sum =0 ;
        for(int ele : nums){
            sum +=ele;
        }
        return expect-sum ;

    }
}