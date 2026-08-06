import java.util.HashSet;

class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            String word = words[i];
            for(int j = 0; j<word.length();j++){
                char ch = word.charAt(j);
                sb.append(morse[ch - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
     
    }
}