import java.util.List;

public class lower {
    public List<String> lower(List<String> strings) {
          for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i).toLowerCase());
        }
        return strings;
}

}
