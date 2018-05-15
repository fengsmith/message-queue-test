import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by shifengqiang on 18/3/22.
 */
public class Test1 {
    public static void main(String[] args) {
        List names = Arrays.asList("1", "2", "3");
        Stream lengths = names.stream().map(name -> names.size());
    }
}
