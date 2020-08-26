package Day2.java;

public class ReverseString {
    public void reverseString(final char[] s) {
        for (var i = 0; i < s.length / 2; i++) {
            final var tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
            
          }
    }

    public static void main(final String[] args) {
        final char[] s = { 'h', 'e', 'l', 'l', 'o' };

        final ReverseString sol = new ReverseString();
        sol.reverseString(s);
       
        System.out.println(s);
    }
}