class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder  firstwrd = new StringBuilder();
        StringBuilder  secondwrd = new StringBuilder();
        for(int i = 0 ; i< word1.length;i++){
            firstwrd.append(word1[i]);
        }
        for(int i = 0 ; i< word2.length;i++){
            secondwrd.append(word2[i]);
        }
        return (firstwrd.toString().equals(secondwrd.toString()));

    }
}