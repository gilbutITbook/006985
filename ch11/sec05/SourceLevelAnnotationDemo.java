package ch11.sec05;

/*
다음 명령을 실행한다.

javac com/horstmann/annotations/ToStringAnnotationProcessor.java
javac -XprintRounds -processor com.horstmann.annotations.ToStringAnnotationProcessor ch11/sec05/*.java
java ch11.sec05.SourceLevelAnnotationDemo
*/

public class SourceLevelAnnotationDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(10, 10), 20, 30);
        System.out.println(com.horstmann.annotations.ToStrings.toString(rect));
    }
}
