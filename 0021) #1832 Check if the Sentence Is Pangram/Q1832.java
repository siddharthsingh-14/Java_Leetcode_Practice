class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        int  count = 0;
        for(int i = 97; i<123;i++){
            char ch = (char) i;
            for(int j = 0 ; j<sentence.length();j++){
                if(sentence.charAt(j)==ch){
                    count++;
                    break;
                }
            }
        }
        return (count == 26);
    }
}