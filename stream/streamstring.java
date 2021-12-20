import java.util.*;
public class streamstring {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("orange", "apple", "banana"));
        fruits.stream()
                .sorted()
                .forEach(m -> System.out.println(m));

    }
}
