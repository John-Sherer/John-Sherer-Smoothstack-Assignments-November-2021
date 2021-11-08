import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class EvenOddLabeler {
    public static String LabelIntegers(List<Integer> list){
        return list.stream().map(i -> {
            if (i%2==0)
                return "e" + Integer.toString(i);
            return "o" + Integer.toString(i);
        }).collect((Collectors.joining((CharSequence)",")));
    }
}
