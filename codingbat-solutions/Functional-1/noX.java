import java.util.ArrayList;
import java.util.List;

public class noX {
    public List<String> noX(List<String> strings) {
  List<String> result = new ArrayList<>();
  for (String str : strings) {
    result.add(str.replace("x", ""));
  }
  return result;

}

}
