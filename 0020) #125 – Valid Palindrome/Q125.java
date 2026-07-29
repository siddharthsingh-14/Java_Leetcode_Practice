class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s =s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder reverse = new StringBuilder(); 
        for(int i =s.length()-1; i>=0;i--){
            reverse.append(s.charAt(i));
        }
        String REV = reverse.toString();
        if(REV.equals(s)){
            return  true;
        }            
        else{
            return false;
        }
    }
}