import java.util.ArrayList;
import java.util.List;

public class noZ {
    public List<String> noZ(List<String> strings) {
    List<String> result = new ArrayList<>();
    for(String word : strings ){
      if (!word.contains("z")){
              result.add(word);
      }
    }
    return result;

}

}
