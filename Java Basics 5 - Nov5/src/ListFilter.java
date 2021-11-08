import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    public static List<String> ThreeLetterAWords(List<String> list){
        return list.stream().filter(p -> p.toLowerCase().charAt(0) == 'a').filter(p -> p.length() == 3).collect(Collectors.toList());
    }
}
