package ch09.sec02;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;

public class ZipDemo {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path javaHome = Paths.get(System.getProperty("java.home"));
        // Path zipFile = javaHome.getParent().resolve("src.zip"); // 자바 9 이전
        Path zipFile = javaHome.resolve("lib/src.zip"); // 자바 9
        if (!Files.exists(zipFile)) {
            System.err.println(zipFile + " does not exist.");
            return;
        }

        // String sourceName = "java/lang/String.java"; // 자바 9 이전
        String sourceName = "java.base/java/lang/String.java"; // 자바 9
        Path tempDir = Files.createTempDirectory("corejava");
        Path targetPath = tempDir.resolve(sourceName);
        Files.createDirectories(targetPath.getParent());
        try (FileSystem zipfs = FileSystems.newFileSystem(zipFile, null)) {
            Files.copy(zipfs.getPath(sourceName), targetPath);
            Files.lines(targetPath).limit(40).forEach(System.out::println);
            
            // src.zip 순회
            try (Stream<Path> entries = Files.walk(zipfs.getPath("/"))) {
               entries.forEach(System.out::println);
            }

            // System.out.println("\nFiles that don't end in .java:");
            // try (Stream<Path> entries = Files.walk(zipfs.getPath("/"))) {
            //     entries.filter(p -> Files.isRegularFile(p) && !p.toString().endsWith(".java"))
            //         .forEach(System.out::println);
            // }
        }

        Path zipPath = tempDir.resolve("myfile.zip");
        URI uri = new URI("jar", zipPath.toUri().toString(), null);
            // URI jar:file://myfile.zip을 생성한다.
        try (FileSystem zipfs = FileSystems.newFileSystem(uri,
                Collections.singletonMap("create", "true"))) {
            // 파일을 추가하려면 해당 파일을 ZIP 파일 시스템에 복사하면 된다.
            Path filePath = targetPath;            
            Files.copy(filePath, zipfs.getPath("/").resolve("String.java"));
        }
        System.out.println("Made zip file at " + zipPath);
    }
}
