import java.util.Arrays;

public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int[] nums = { a, b, c };
        Arrays.sort(nums);

        return (nums[1] - nums[0]) == (nums[2] - nums[1]);

    }

}
