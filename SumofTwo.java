class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        
        
        
        
        while (i<length){
        int i = 0; 
         int j = i+1;
           while(j<length){
           //    System.out.println(j+"j) Array element is "+nums[j]);
              
               if(nums[i]+nums[j]==target){
                   System.out.println("SHOUT!");
                   int[] sol = new int[]{i,j};
                   return sol;
                   
               }
                j++;
           }
           
          // System.out.println(i+"i) Array element is "+nums[i]);
           
           i++;
          
       }
         return nums;
        
    }
    
}