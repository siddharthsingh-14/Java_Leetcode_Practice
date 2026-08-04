class Solution1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] S = new String[words.length];
        for(int i =0 ; i<words.length;i++){
            String word = words[i];
            int Length = word.length()-1;
            int a = word.charAt(Length)-'1';
            S[a]=word.substring(0,Length);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<S.length;i++){
            sb.append(S[i]);
            if(i<S.length-1){
                sb.append(" ");
            }
            
        }
        return sb.toString();
        
    }
}