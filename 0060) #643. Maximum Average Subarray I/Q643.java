class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
           
           int sum = Integer.MIN_VALUE;

           for(int i = 0; i <= nums.length - k; i++){

                int tempSum = 0;
                for(int j = i; j < k + i; j++) tempSum += nums[j];

                sum = Math.max(sum , tempSum);
           }

           return (double)sum/k;
    }
}