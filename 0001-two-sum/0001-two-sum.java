class Solution {
    public int[] twoSum(int[] nums, int target) {
  int index1 = 0 ;
  int index2 =0;
  int sum  = 0 ;

          for(int i = 0 ; i<nums.length ; i++){
              
              for(int j = 0 ; j<nums.length ; j++){
                    
                    if(i==j){
                        continue;
                    }
                    if((nums[i] + nums[j]) == target){
                        index1 = i;
                        index2 = j;
                        break;
                    }

              }
              
          }
        
          return new int[]{index1, index2};
        
    }
}