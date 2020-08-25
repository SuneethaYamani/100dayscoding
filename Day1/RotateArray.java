package Day1;
class RotateArray {
    public void rotate(final int[] nums, int k) {
        k %= nums.length;
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static void main(final String[] args) {
        final int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        final int k = 3;
         RotateArray sol = new RotateArray();
        sol.rotate(nums, k);
        for (int j = 0; j < nums.length; j++) {
        	 System.out.println(nums[j]);
        }
       
    }
}