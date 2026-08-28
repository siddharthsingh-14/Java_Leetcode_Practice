import java.util.HashMap;

class Solution409 {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int  count  = 0;
        boolean  isoddpresent = false;
        for(int i =0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int  value : map.values()){
            if(value % 2 == 0){
                count += value;
            }
            else if(value % 2 == 1){
                count += value-1;
                isoddpresent = true;
            }
            
        }
        if(isoddpresent){
            count++;
        }
        
        return count  ;
    }
}