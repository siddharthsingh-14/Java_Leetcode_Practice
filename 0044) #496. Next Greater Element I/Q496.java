class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int  i = 0;  i < nums1.length;i++){
            int  a = 0;
            int  num  = nums1[i];
            for( int j = 0; j<nums2.length;j++){
                if(num==nums2[j]){
                    a=j;
                }
            }
            result[i]=-1;
            for(int j = a+1; j<nums2.length;j++){
                if(nums2[j]>num) {
                    result[i]=nums2[j];
                    break;
                }
            }
            
        }
        return result;
    }
}