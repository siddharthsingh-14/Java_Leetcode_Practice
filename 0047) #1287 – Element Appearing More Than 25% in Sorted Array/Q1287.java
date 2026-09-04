import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution1287 {
    public int findSpecialInteger(int[] arr) {
        int passcriteria = arr.length/4;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int  val : arr){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
            new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        pq.addAll(map.entrySet());
        Map.Entry<Integer, Integer> entry = pq.poll();

        if(entry.getValue() > passcriteria){
            return entry.getKey();
        }
        else return 0 ;
    }
}