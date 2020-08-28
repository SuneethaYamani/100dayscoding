package Day3.java;

public class CountPrimes {
	public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i<n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int n) {
        int d = 2;
        int root = (int) Math.sqrt(n);
        while(d<=root){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static void main(final String[] args) {
        final int s = 3;

        final CountPrimes sol = new CountPrimes();
       System.out.println(sol.countPrimes(s)); 
       
       
    }
}
