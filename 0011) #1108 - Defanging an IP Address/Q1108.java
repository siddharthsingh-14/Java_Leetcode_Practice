class Solution1108 {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                ans.append("[.]");
            }
            else{
               ans.append(address.charAt(i));
            }
        }
        String answer = ans.toString();
        return answer;
    }
}
