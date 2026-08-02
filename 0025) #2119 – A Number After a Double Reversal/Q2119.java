class Solution2119 {
    public boolean isSameAfterReversals(int num) {
        int  reversed = 0; 
        int number = num;
        while(number!=0){
            int n = number%10;
            number= number/10;
            reversed = (reversed*10)+n;
            }
        int reversed1 = 0;
        int number1 = reversed;
        while(number1!=0){
            int n1 = number1%10;
            number1= number1/10;

            reversed1 = (reversed1*10)+n1;        
        }
        return(reversed1==num);
    }
}