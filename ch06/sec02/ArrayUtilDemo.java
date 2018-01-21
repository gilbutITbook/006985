package ch06.sec02;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        ArrayUtil.swap(friends, 0, 1);
        
        // 주석을 해제하면 오류 메시지를 확인할 수 있다.
        // Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
    }
}
