import java.util.ArrayList;
import java.util.List;

public class square56 {
   public List<Integer> square56(List<Integer> nums) {
  List<Integer> result = new ArrayList<>();

  for (int num :nums ){
    int resulting = num * num + 10 ;
    if(resulting % 10 != 5 && resulting % 10 != 6 ){
      result.add(resulting);
    }
  }
    return result ;

}
 
}
