import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practice3Test {
    @Test
    void getBiggest() {
        Practice3 practice3 = new Practice3();
        int biggest = practice3.getBiggest(1, 2, 3);

        assertEquals(3, biggest);
    }

    @Test
    void getBiggest2() {
        Practice3 practice3 = new Practice3();
        int biggest = practice3.getBiggest2(1, 2, 3);

        assertEquals(3, biggest);
    }
}
