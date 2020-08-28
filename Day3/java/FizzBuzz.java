package Day3.java;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> fizzBuzz(final int n) {
        final List<String> sol = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++) {
              final boolean divisibleBy3 = (i % 3 == 0);
      final boolean divisibleBy5 = (i % 5 == 0);
             final boolean divisibleBy15 = (i % 15 == 0);
            if (divisibleBy15) {  sol.add("FizzBuzz"); } 
            else if (divisibleBy5) {  sol.add("Buzz"); } 
            else if (divisibleBy3) { sol.add("Fizz"); }
            else {
                // Not divisible by 3 or 5, add the number
                sol.add(Integer.toString(i));
              }
             
        }
		return sol;
    }
    public static void main(final String[] args) {
        final int s = 15;

        final FizzBuzz sol = new FizzBuzz();
       System.out.println(sol.fizzBuzz(s)); 
       
       
    }
}