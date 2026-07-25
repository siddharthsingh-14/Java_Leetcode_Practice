class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        String str ="" ;
        char front = ' ';
        char rear = ' ';
        for(int i = 0; i< operations.length;i++){
            str = operations[i];
            front = str.charAt(0);
            rear = str.charAt(str.length()-1);
            if(front == '+' || rear =='+'){
                x=x+1;
            }
            else{
                x=x-1;
            }
        }
        return x;
    }
}
