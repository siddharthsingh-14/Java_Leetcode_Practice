class Solution204 {
    public int countPrimes(int n) {
        int  count = 0;
        //Sieve of Eratosthenes
        boolean[] prime = new boolean[n];
        for(int i =0 ; i<n; i++){
            prime[i]= true;
        }
        for(int i = 2 ; i*i<n;i++){

            for(int  j = i*i; j<n; j+=i){
                prime[j]= false;
            }
        }
        for (int i = 2; i <n; i++) {

            if (prime[i]) {
                count++;
            }
        }
        return  count;
    }
}