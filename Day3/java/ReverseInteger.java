package Day3.java;

public class ReverseInteger {
	public int reverse(int x) {
	    int rev = 0;
	    while(x!=0){
	        int rem = x%10;
	     
	        if ((rev > Integer.MAX_VALUE / 10))
	            return 0;
	        if ((rev < Integer.MIN_VALUE / 10))
	            return 0;
	        rev = rev*10 + rem;
	        x = x/10;
	    }
	    return rev;
	}

    public static void main(final String[] args) {
        final int s = 123;

        final ReverseInteger sol = new ReverseInteger();

       
        System.out.println(sol.reverse(s));
    }
}