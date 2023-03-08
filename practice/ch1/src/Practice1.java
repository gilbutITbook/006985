// 정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라. 읽어 온 정수의 역수를 16진 부동소수점 수로 출력하라.

public class Practice1 {

    public String toBinary(int number) {
        return Integer.toString(number, 2);
    }

    public String toOctal(int number) {
        return Integer.toString(number, 8);
    }

    public String toHexadecimal(int number) {
        return Integer.toString(number, 16);
    }

    public double getReciprocal(int number) {
        return 1.0 / number;
    }

    public String convertRadix(int number, int radix) {
        return Integer.toString(number, radix);
    }
}
