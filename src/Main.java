import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

/**
 * @author zz
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(16);
        objectObjectHashMap.put("asd", "123sac");
        objectObjectHashMap.put("xc", "123sac");
        objectObjectHashMap.put("as2d", "123sac");

        objectObjectHashMap.forEach((key, value) -> {
            System.out.println(key + "--" + value);
        });


        double random = Math.random();
        Random random1 = new Random();
        IntStream ints = random1.ints();


    }
}