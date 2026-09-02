import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");
        HashMap<String ,Integer> map = new HashMap<>();
        for(String word : word1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word : word2){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        ArrayList<String> list = new ArrayList<>();

        for(String key: map.keySet()){
            if(map.get(key)==1){
                list.add(key); 
            }
        }

        return list.toArray(new String[0]);
    }
}
