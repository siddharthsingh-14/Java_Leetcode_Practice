public class Q1672 {
    public int maximumWealth(int[][] accounts) {
        int totalwealth = 0;
        int  maxwealth = 0;
        for(int i = 0 ; i < accounts.length;i++){
            totalwealth = 0;
            for(int j = 0; j< accounts[i].length;j++){
                totalwealth += accounts[i][j];
            }
            if(totalwealth> maxwealth){
                maxwealth= totalwealth;
            }
        }
        return maxwealth;
    }
}
