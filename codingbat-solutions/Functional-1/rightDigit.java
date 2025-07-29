import java.util.List;

public class rightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
         for (int i = 0; i < nums.size(); i++) {
        nums.set(i, nums.get(i)%10);
      }
      return nums;
}

}
