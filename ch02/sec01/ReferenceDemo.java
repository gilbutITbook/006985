package ch02.sec01;

import java.util.ArrayList;

public class ReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
            // friends는 비어 있다.
        friends.add("Peter");
            // friends의 크기는 1이다.
        ArrayList<String> people = friends;
            // 이제 people과 friends는 같은 객체를 참조한다.
        people.add("Paul");
        System.out.println(friends);
    }
}
