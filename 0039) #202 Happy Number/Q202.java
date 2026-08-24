import java.util.HashSet;

class Solution202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int tup = n ;
        while(tup!=1){
            int sum =0 ;
            while(tup>0){
                int lastnum = tup%10;
                sum += lastnum*lastnum;
                tup = tup/10;
            }
            
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            tup = sum;
            
        }
        
        return (tup==1);
    }
}
