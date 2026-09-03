import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char chr : s.toCharArray()){
            map.put(chr,map.getOrDefault(chr,0)+1);
        }
         // Entries ko List mein store
        List<Map.Entry<Character, Integer>> list =
            new ArrayList<>(map.entrySet());

        // Frequency ke according descending sort
        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder sb = new  StringBuilder();

        // Sorted entries se result banana
        for(Map.Entry<Character, Integer> entry : list){

            char ch = entry.getKey();
            int value = entry.getValue();

            for(int i = 0; i < value; i++){
                sb.append(ch);
            }
        }
        return  sb.toString();
    }
}
