package ch09.sec01;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharsetDemo {
    public static void main(String[] args) {
        System.out.println("Default charset on this computer: " + Charset.defaultCharset());
        System.out.println("Available charsets on this JVM: " + Charset.availableCharsets().keySet());
        
        String str = "Java\u2122";
        System.out.println(str);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        showBytes(bytes);
            // 트레이드마크 문자(™)는 3바이트를 차지한다는 점을 주의하자.
        showBytes(str.getBytes(StandardCharsets.UTF_16));
            // 바이트 순서 표시에 주의하자.
        showBytes(str.getBytes(StandardCharsets.ISO_8859_1));
            // 트레이드마크 문자(™)는 인코드할 수 없어서 ?로 표시한다.
        
        System.out.println(new String(bytes, Charset.forName("windows-1252")));
            // 잘못된 인코딩이라는 걸 어떻게 설명할 수 있는가? 프로그램에서 어떻게 알려야 하는가?
    }
    
    public static void showBytes(byte[] bytes) {
        for (byte b : bytes) System.out.printf("%2X ", b);
        System.out.println();
    }
}
