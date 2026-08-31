import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.add(num);
        } 
        for(int i=1;i<=nums.length;i++){
            if(!map.contains(i)){
                list.add(i);
            } 
        }     
    return  list;
    }
}
