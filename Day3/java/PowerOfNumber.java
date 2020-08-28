package Day3.java;

public class PowerOfNumber {
    public boolean isPowerOfThree(final int n) {
        return n > 0 && Math.pow(3,19) % n == 0; 
     }
     
    public static void main(final String[] args) {
        final int s = 9;

        final PowerOfNumber sol = new PowerOfNumber();
       System.out.println(sol.isPowerOfThree(s)); 
       
       
    }
}