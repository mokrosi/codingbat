import java.util.ArrayList;
import java.util.List;

public class no34 {
    public List<String> no34(List<String> strings) {
 
      List<String> result = new ArrayList<>();
    for(String word : strings ){
      if (word.length() != 4 && word.length() != 3 ){
              result.add(word);
      }
    }
    return result;
}

}
