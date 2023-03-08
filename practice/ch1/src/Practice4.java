// double 타입인 양수 값 중 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성해라

public class Practice4 {
    public double biggestDouble() {
        return Math.nextUp(Double.MAX_VALUE);
    }

    public double minDouble() {
        return Math.nextUp(0);
    }
}
