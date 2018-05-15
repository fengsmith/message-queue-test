import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by shifengqiang on 18/3/21.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.forEach(e -> {System.out.println(e);
            System.out.println("aaaaaaaa");
            System.out.println("bbbbbbbb");
            System.out.println("cccccccc");
            System.out.println("dddddddd");
            System.out.println("eeeeeeee");
        });

        Function function = Test::main;

    }

    private static Object main(Object o) {
        return null;
    }
}
//
//class TestFunctionalInterface implements Consumer {
//
//
//    @Override
//    public void accept(Object o) {
//        System.out.println(o);
//    }
//}
