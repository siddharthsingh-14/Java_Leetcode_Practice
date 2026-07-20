class Solution9 {
    public boolean isPalindrome(int x) {
        int reversenum = 0 ;
        int num = x;
        if(x>=0){
            while(num!=0){
                reversenum =(10*reversenum)+(num%10);
                num = num/10;
            }
            if(reversenum == x){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }

    
}