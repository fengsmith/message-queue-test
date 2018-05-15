import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by shifengqiang on 18/3/22.
 */
public class Test2 {

    public static void main(String[] args) {
        Optional< String > fullName = Optional.ofNullable(null);
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }

    private static void test() {
        System.out.println("hello");
    }


}
