import java.util.List;

public class addStar {
    public List<String> addStar(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i)+"*");
        }
        return strings;

}

}
