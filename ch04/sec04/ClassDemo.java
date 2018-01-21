package ch04.sec04;

public class ClassDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        Object obj = System.out;
        Class<?> cl = obj.getClass();
        
        System.out.println("This object is an instance of " + cl.getName());

        String className = "java.util.Scanner";
        cl = Class.forName(className);
            // java.util.Scanner 클래스를 기술하는 객체다.
        cl = java.util.Scanner.class;
        System.out.println(cl.getName());
        Class<?> cl2 = String[].class; // String[] 배열 타입을 기술한다.
        System.out.println(cl2.getName());
        System.out.println(cl2.getCanonicalName());
        Class<?> cl3 = Runnable.class; // Runnable  인터페이스를 기술한다. 
        System.out.println(cl3.getName());
        Class<?> cl4 = int.class; // int 타입을 기술한다.
        System.out.println(cl4.getName());
        Class<?> cl5 = void.class; // void 타입을 기술한다.
        System.out.println(cl5.getName());
    }
}
