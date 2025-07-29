import java.util.List;

public class square {
    public List<Integer> square(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * nums.get(i));
        }
        return nums;

}

}
