import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practice2Test {
    @Test
    void normalization1() {
        Practice2 practice2 = new Practice2();

        int normalized = practice2.normalization(1);

        assertEquals(1 % 360, normalized);
    }

    @Test
    void normalization2() {
        Practice2 practice2 = new Practice2();

        int normalized = practice2.normalization2(1);

        assertEquals(Math.floorMod(1, 360), normalized);
    }

    @Test
    void compare() {
        Practice2 practice2 = new Practice2();
        int a = practice2.normalization(-10);
        int b = practice2.normalization2(-10);

        assertTrue(practice2.compare(a, b));
    }
}
