import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {
    public static List<Integer> rightDigit(List<Integer> list){
        return list.stream().map((i) -> i%10).collect(Collectors.toList());
    }
}
