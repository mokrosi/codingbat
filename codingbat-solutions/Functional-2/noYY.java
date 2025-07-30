import java.util.ArrayList;
import java.util.List;

public class noYY {
    public List<String> noYY(List<String> strings) {
    List<String> result = new ArrayList<>();
        for (String word : strings) {
        String withY = word + "y";
        if (!withY.contains("yy")) {
            result.add(withY);
        }
    }
    return result;

}

}
