package ch08.sec06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class SimpleReductions {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
                StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        Optional<String> largest = words.stream().max(String::compareToIgnoreCase);
        System.out.println("largest: " + largest.orElse(""));

        boolean aWordStartsWithQ = words.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("aWordStartsWithQ: " + aWordStartsWithQ);

        Optional<String> startsWithQ = words.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
        System.out.println("startsWithQ: " + startsWithQ.orElse("(None)"));
            // 프로그램을 다시 실행해서 다른 단어를 찾는지 확인해보자.
    }
}
