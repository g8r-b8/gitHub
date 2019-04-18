class Leet1 {
    
   // private int[] objRa; 
    
    public static int[] twoSum(int[] nums, int target) {
      int length = nums.length;
      int index=0;
     for(int element:nums) {
         for(int i=index+1; i<length;i++){
             if(nums[index]+nums[i]==target){
                 //System.out.printf("\nayy ur nums ar %d and %d\n", nums[i], nums[i+1]);
               int[] j = new int[]{index,i};
                 return j;
             }
             //else{index++;}
           
        
             }
         index++;
         }
         int[] zero=new int[]{0};
        return zero; 
    }

        
        
        
    
    
    public static void main(String[] args){
        
        int[] testRa= new int[]{2,7,11,15};
        
        System.out.printf("\nayy ur nums ar "+Leet1.twoSum(testRa,9));
        
    }
}
