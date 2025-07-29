import java.util.*;
public class doubling {

    public List<Integer> doubling(List<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }
        return nums;

    }
    
}
