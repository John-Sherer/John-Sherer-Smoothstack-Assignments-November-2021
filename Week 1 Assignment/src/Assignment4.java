import java.util.List;
import java.util.stream.Collectors;

public class Assignment4 {
    public static List<String> noX(List<String> list){
        return list.stream().map((s) -> s.replaceAll("x","")).collect(Collectors.toList());
    }
}
