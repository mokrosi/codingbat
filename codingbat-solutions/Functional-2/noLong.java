import java.util.ArrayList;
import java.util.List;

public class noLong {
   public List<String> noLong(List<String> strings) {
      List<String> result = new ArrayList<>();
    for(String word : strings ){
      if (word.length() < 4 ){
              result.add(word);
      }
    }
    return result;
}
 
}
