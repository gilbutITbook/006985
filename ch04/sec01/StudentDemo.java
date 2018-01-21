package ch04.sec01;

public class StudentDemo {
    public static void main(String[] args) {
        Person p = new Student("Fred", 1729); // 구체적인 서브클래스이므로 할당해도 된다.
        System.out.println(p.getName());
        Student s = (Student) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
    }
}
