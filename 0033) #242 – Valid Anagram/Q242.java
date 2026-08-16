import java.util.HashMap;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        for(int i = 0 ; i<s.length(); i++){
            char ch  = s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        if (s.length() != t.length()) {
            return false;
        }
        for(int i = 0 ; i<t.length(); i++){
            char ch = t.charAt(i);
            
            if (!map.containsKey(ch)) {
                return false;
            }
            
            int value = map.get(ch);

            if(value<=0){
                return false;
            }
            else{
                value--;
                map.put(ch, value);
            }
        }
        return true;

    }
}