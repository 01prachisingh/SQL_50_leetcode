class Solution {
    public void rotate(int[] nums, int k) {
           k = k % nums.length;

       int start = 0;
       int  end = nums.length - 1;
       while(start < end){
           int temp  = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
           
           start++;
           end--;
       } 
        int old = 0;
        int neww = k-1;
       while(old<neww){
           int temp = nums[old];
           nums[old] = nums[neww];
           nums[neww] = temp;
           
           old++;
           neww--;
       }
       
       
        int old2 = k;
        int new2 = nums.length -1;
       while(old2<new2){
           int temp2 = nums[old2];
           nums[old2] = nums[new2];
           nums[new2] = temp2;
           
           old2++;
           new2--;
       }
    
    }
}