package test01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestStream {

    public static void main(String[] args) throws IOException {
        int[] count = new int[]{1};
        Files.lines(Paths.get("D:\\java\\project\\test\\src\\test01\\2015.txt"))
                .filter((s) -> s.contains("малыш"))
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .peek((s) -> System.out.println(count[0]++ + " " + s))
                .limit(50)
                .forEach(System.out::println);

    }
}

