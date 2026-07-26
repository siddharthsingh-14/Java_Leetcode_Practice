class Solution657 {
    public boolean judgeCircle(String moves) {
        int totalU =0;
        int totalD =0;
        int totalL =0;
        int totalR =0;
        for(int i = 0; i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                totalU++;
            }
            else if(moves.charAt(i)=='D'){
                totalD++;
            }
            else if(moves.charAt(i)=='L'){
                totalL++;
            }
            else {
                totalR++;
            }
        }
        if(totalU == totalD && totalL == totalR ){
            return true;
        }
        else{
            return  false;
        }
    }
}