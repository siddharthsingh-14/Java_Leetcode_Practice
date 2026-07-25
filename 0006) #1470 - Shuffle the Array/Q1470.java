class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] newarray = new int[2*n];
        for(int i=0; i<n;i++){
            newarray[2*i]=nums[i];
            newarray[2*i+1]=nums[i+n];
        }
        return newarray;
    }
}