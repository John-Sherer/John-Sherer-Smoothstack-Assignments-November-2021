import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaDemo {

    public List<String> ShortestToLongest(List<String> words){
        return words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    }

    public List<String> LongestToShortest(List<String> words){
        return words.stream().sorted(Comparator.comparing(s -> -s.length())).collect(Collectors.toList());
    }

    public List<String> SimpleAlphabetical(List<String> words){
        return words.stream().sorted(Comparator.comparing(s -> s.toLowerCase().charAt(0))).collect(Collectors.toList());
    }

    public List<String> StringsContainingE(List<String> words){
        return words.stream().sorted(Comparator.comparing(s -> {
            char[] chars = s.toUpperCase().toCharArray();
            for(char c : chars){
                if(c == 'E') {
                    return 0;
                }
            }
            return 1;
        })).collect(Collectors.toList());
    }

    public List<String> StringsContainingEHelper(List<String> words){
        return words.stream().sorted((s1, s2) -> HasE(s1, s2)).collect(Collectors.toList());
    }

    // The helper method in question:
    public static int HasE(String s1, String s2){
        for(char c1 : s1.toLowerCase().toCharArray()){
            if(c1 == 'e'){
                for(char c2 : s2.toLowerCase().toCharArray()){
                    if(c2 == 'e'){
                        return 0;
                    }
                }
                return -1;
            }
        }
        for(char c2 : s2.toLowerCase().toCharArray()){
            if(c2 == 'e'){
                return 1;
            }
        }
        return 0;
    };
}
