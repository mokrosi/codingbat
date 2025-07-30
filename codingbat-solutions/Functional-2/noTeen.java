import java.util.ArrayList;
import java.util.List;

public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
  
  List<Integer> result = new ArrayList<>();
  for(int num : nums){
    if(num < 13 || num > 19 ){
      result.add(num);
    }
  }
  return result;
}

}
