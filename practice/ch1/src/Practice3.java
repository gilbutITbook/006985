// 조건 연산자만 사용해 정수 세 개를 읽고 최대값을 출력하는 프로그램을 작성하라.
// Math.max()를 사용해 같은 프로그램을 작성하라

import java.util.Arrays;

public class Practice3 {

    public int getBiggest(int... numbers) {
        int answer = 0;

        for (int number: numbers) {
            if (number > answer) {
                answer = number;
            }
        }

        return answer;
    }

    public int getBiggest2(int... numbers) {
        int answer = 0;

        for (int number: numbers) {
            answer = Math.max(number, answer);
        }

        return answer;
    }
}
