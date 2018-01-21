package ch02.sec04;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();
    static {
        // 배열 리스트 expirationYear에 다음 20년을 추가한다.
        int year = LocalDate.now().getYear();
        for (int i = year; i <= year + 20; i++) {
            expirationYear.add(i);
        }   
    }
    // ...
}
