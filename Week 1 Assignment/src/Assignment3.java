import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {
    public static List<Integer> doubling(List<Integer> list){
        return list.stream().map((i) -> i*2).collect(Collectors.toList());
    }
}
