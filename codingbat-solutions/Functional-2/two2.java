import java.util.ArrayList;
import java.util.List;

public class two2 {
    public List<Integer> two2(List<Integer> nums) {
  List<Integer> result = new ArrayList<>();
  for(int num : nums){
    if((num*2 % 10) != 2){
      result.add(num*2);
    }
  }
  return result ;
}

}
