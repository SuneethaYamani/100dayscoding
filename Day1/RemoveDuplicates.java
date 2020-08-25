package Day1;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(final String[] args) {
        final int[] nums = { 1,1,2,2,3,3 };
        final int k = 3;
         RemoveDuplicates sol = new RemoveDuplicates();
         System.out.println(sol.removeDuplicates(nums));
       
       
    }
}
