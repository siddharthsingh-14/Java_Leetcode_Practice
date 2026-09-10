class Solution283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length-1;
        int a =0;
        int []  result = new  int[nums.length];
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i]==0){
               result[n] = 0;
               n--;
            }
            else {
                result[a]=nums[i];
                a++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}