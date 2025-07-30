import java.util.ArrayList;
import java.util.List;

public class no9 {
   public List<Integer> no9(List<Integer> nums) {
  List<Integer> result = new ArrayList<>();
  for(int num : nums){
    if(num % 10 != 9 ){
      result.add(num);
    }
  }
  return result;
}
 
}
