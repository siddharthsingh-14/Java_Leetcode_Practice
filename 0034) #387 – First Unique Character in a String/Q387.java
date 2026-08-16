class Solution387 {
    public int firstUniqChar(String s) {
        int count;
        for(int i = 0 ;i<s.length();i++){
            count = 0; 
            for(int j = 0 ; j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return i;
            }
            
        }
        return -1;
    }
}
