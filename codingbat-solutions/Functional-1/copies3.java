import java.util.List;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i)+strings.get(i)+strings.get(i));
        }
        return strings;
}

}
