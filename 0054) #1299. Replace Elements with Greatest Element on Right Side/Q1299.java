class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int  max  = 0;
        int[] result =  new int[arr.length];

        for(int i = 0 ; i<arr.length - 1;i++){
            max = arr[i + 1]; 
            for(int j = i+1; j<arr.length;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            result[i]= max;
        }

        result[result.length - 1] = -1;
        return result;
    }
}