class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0; i<list1.length;i++){
            for(int j = 0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    int sum1 = i+j;
                    //add
                    if( sum1<sum){
                        sum =sum1;
                        ans.clear();
                        ans.add(list1[i]);
                    }
                    if(sum1 == sum && !ans.contains(list1[i])){
                        ans.add(list1[i]);
                    }
                }
            }

        }
        return ans.toArray(new String[0]);
        
    }
}