import java.util.Arrays;

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0 ; i< nums.length; i++){
            int  squareing = (int)Math.pow(nums[i],2);
            result[i]=squareing;
        }
        Arrays.sort(result);
        return  result;
    }
}
