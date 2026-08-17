import java.util.HashMap;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
       HashMap<Character, Character> map = new HashMap<>();
       for(int i =0 ; i < s.length();i++){
            char S =s.charAt(i) ;
            char T =t.charAt(i) ;
            
            if(map.containsKey(S)){
                if(map.get(S)!=T){
                    return false;
                }
            }
            if(!map.containsKey(S) && map.containsValue(T)){
                return false;
            }

            map.put(S,T);


       }

       return true;
       
    }
}
