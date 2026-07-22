class Solution {
    public int pivotIndex(int[] nums) {
        int size = nums.length;
        int [] left = new int[size];
        int [] right = new int[size] ; 
          int sum = 0 ;

   for(int i = 0 ; i<nums.length ; i++){
          sum += nums[i];
          left[i] = sum ;
   }

sum = 0 ;

  for(int i = nums.length-1 ; i>=0 ; i--){
          sum += nums[i];
          right[i] = sum ;
   }


   for(int i = 0 ; i<nums.length ; i++){
      if(left[i]==right[i]){
        return i ;
      }
   }




        return -1; 

    }
}