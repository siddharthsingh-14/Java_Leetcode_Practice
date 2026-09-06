import java.util.HashMap;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new  HashMap<>(); 
        HashMap<Character,Integer> map2 = new  HashMap<>();

        for(int i = 0; i<ransomNote.length();i++){
            char ch1 = ransomNote.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        for(int i = 0; i<magazine.length();i++){
            char ch2 = magazine.charAt(i);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        for(int i = 0; i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            int val1 = map1.get(ch);
            int val2 = map2.getOrDefault(ch,0);
            if(val1>val2){
                return  false;
            }
        }
        return true;
    }
}