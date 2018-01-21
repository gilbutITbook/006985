package ch06.sec05;

import java.util.ArrayList;

public class WordListDemo {
    public static void main(String[] args) {
        WordList words = new WordList();
        ArrayList<String> strings = words; // 슈퍼클래스로 변환하므로 괜찮다.
        strings.add("Hello");
        strings.add("C++");
        System.out.println(words);
    }
}
