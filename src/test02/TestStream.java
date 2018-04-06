package test02;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.add("We love");
        strings.add("Java 8");

        strings
                .stream()
                .filter(s->s.startsWith("W"))
                .forEach(System.out::print);

    }
}
