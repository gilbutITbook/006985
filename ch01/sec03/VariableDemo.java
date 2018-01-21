package ch01.sec03;

import java.util.Random;

public class VariableDemo {
    public static final int DAYS_PER_YEAR = 365;
    
    enum Weekday { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };
    
    public static void main(String[] args) {
        int total = 0;
        int i = 0, count;
        Random generator = new Random();
        double lotsa$ = 1000000000.0; // 규칙에 어긋나지는 않지만 좋은 생각은 아니다.
        double élévation = 0.0;
        double π = 3.141592653589793;
        String Count = "Dracula"; // count와 다른 변수다.
        int countOfInvalidInputs = 0; // 낙타 표기법의 예
        final int DAYS_PER_WEEK = 7;
        Weekday startDay = Weekday.MONDAY;
        // count가 초기화되지 않았으므로 다음 줄의 주석을 해제하면 오류가 일어난다.
        // System.out.println(count); 
    }
}
