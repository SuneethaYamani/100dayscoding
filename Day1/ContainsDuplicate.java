package Day1;
import java.util.*;
class ContainsDuplicate {
    public boolean containsDuplicate(final int[] nums) {
        final Set<Integer> set = new HashSet<>(nums.length);
        for (final int x : nums) {
    
    if(!set.add(x))
        return true;
}
return false;
    }
    public static void main(final String[] args) {
        final int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
       
         ContainsDuplicate sol = new ContainsDuplicate();
        System.out.println(sol.containsDuplicate(nums));
        
    }
}