class Solution1221 {
    public int balancedStringSplit(String s) {
        int  count=0;
        int Lcount=0;
        int Rcount=0;
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='L'){
                Lcount++;
            }
            else if(s.charAt(i)=='R'){
                Rcount++;
            }
            if(Rcount == Lcount){
                count++;
            }
        }
        return count;
    }
}