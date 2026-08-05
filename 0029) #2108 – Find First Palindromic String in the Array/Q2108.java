class Solution2108 {
    public String firstPalindrome(String[] words) {
        String word = "";
        for(int i = 0; i<words.length;i++){
            word = words[i];
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<word.length();j++){
                sb.append(word.charAt(j));
            }
            sb.reverse();
            if(word.equals(sb.toString())){
                break;
            }
            else{
                word ="";
            }
            
        }
        return  word;

    }
}