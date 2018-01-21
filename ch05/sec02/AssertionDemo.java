// 일반적으로 단정은 비활성화되어 있다.
// 단정 오류를 확인하려면 단정을 활성화한 채로 실행해야 한다.

package ch05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class AssertionDemo {
    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        assert discriminant >= 0;
        assert a != 0 : "a == 0; not a quadradic equation";
        double discrRoot = Math.sqrt(discriminant);
        return new double[] { 
                (-b - discrRoot) / (2 * a),
                (-b + discrRoot) / (2 * a)
        };
    }
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a b c (e.g. 0 2 1)");
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            System.out.println(Arrays.toString(solveQuadraticEquation(a, b, c)));
        }
    }
}
