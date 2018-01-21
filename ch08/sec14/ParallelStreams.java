package ch08.sec14;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.groupingByConcurrent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelStreams {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(
                Paths.get("alice.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        // 아주 안 좋은 코드다.
        int[] shortWords = new int[10];
        words.parallelStream().forEach(
            s -> { if (s.length() < 10) shortWords[s.length()]++; });
        System.out.println(Arrays.toString(shortWords));

        // 재시도 -- 결과가 다를 수 있다(이번에도 틀릴 수 있음).
        Arrays.fill(shortWords, 0);
        words.parallelStream().forEach(
            s -> { if (s.length() < 10) shortWords[s.length()]++; });
        System.out.println(Arrays.toString(shortWords));

        // 해결책: 그룹 및 카운트
        Map<Integer, Long> shortWordCounts =
            words.parallelStream()
                .filter(s -> s.length() < 10)
                .collect(
                    groupingBy(
                        String::length,
                        counting()));
               
        System.out.println(shortWordCounts);
        
        // 다운스트림 순서는 결정적이지 않다.
        Map<Integer, List<String>> result = words.parallelStream().collect(
                Collectors.groupingByConcurrent(String::length));

        System.out.println(result.get(14));

        result = words.parallelStream().collect(
                Collectors.groupingByConcurrent(String::length));

        System.out.println(result.get(14));
        
        Map<Integer, Long> wordCounts =
                words.parallelStream()
                    .collect(
                        groupingByConcurrent(
                            String::length,
                            counting()));
                   
        System.out.println(wordCounts);
    }
}
