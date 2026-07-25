public class Q1342 {
    class Solution {
    public int numberOfSteps(int num) {
        int newnum = num;
        int count =0 ;
        while(newnum!= 0){
            if(newnum%2==0){
                newnum= newnum/2;
                count++;
            }
            else{
                newnum = newnum-1;
                count++;
            }
        }
        return  count;
    }
}
}
