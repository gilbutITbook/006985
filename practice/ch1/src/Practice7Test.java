import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Practice7Test {
    @Test
    void getList() {
        Practice7 practice7 = new Practice7();
        List<Integer> list = practice7.getList(49);

        assertEquals(49, list.size());
    }

    @Test
    void choice() {
        Practice7 practice7 = new Practice7();
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));

        Integer chosen = practice7.choice(numbers, 1);

        assertEquals(2, chosen);
        assertEquals(2, numbers.size());
    }

    @Test
    void lottery() {
        Practice7 practice7 = new Practice7();
        List<Integer> numbers = practice7.lottery();

        assertEquals(6, numbers.size());
    }
}
