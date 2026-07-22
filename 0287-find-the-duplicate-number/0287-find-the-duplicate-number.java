class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> newSet  = new HashSet<>();
   int result  = 0 ; 
       for(int ele : nums){

        if(newSet.contains(ele)){
            result  = ele ;
        }
        else{
            newSet.add(ele);
        }
       }

       return result ;
    }
}