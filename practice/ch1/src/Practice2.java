// 정수(양의 정수 또는 음의 정수)로 된 각도를 읽고 0 ~ 359도 사이의 값으로 정규화하는 프로그램을 작성하라.
// 먼저 % 연산자를 사용한 후 floorMod 메서드를 이용해 작성한다

public class Practice2 {

    public int normalization(int number) {
        if (number > 0) {
            return number % 360;
        }

        return (number % 360 + 360) % 360;
    }

    public int normalization2(int number) {
        return Math.floorMod(number, 360);
    }

    public boolean compare(int a, int b) {
        return a == b;
    }
}
