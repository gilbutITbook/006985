import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Practice1Test {
    @Test
    void toBinary() {
        Practice1 practice1 = new Practice1();
        String binary = practice1.toBinary(10);

        assertEquals("1010", binary);
    }

    @Test
    void toOctal() {
        Practice1 practice1 = new Practice1();
        String octal = practice1.toOctal(10);

        assertEquals("12", octal);
    }

    @Test
    void toHexadecimal() {
        Practice1 practice1 = new Practice1();
        String hexadecimal = practice1.toHexadecimal(10);

        assertEquals("a", hexadecimal);
    }

    @Test
    void getReciprocal() {
        Practice1 practice1 = new Practice1();
        double reciprocal = practice1.getReciprocal(10);

        assertEquals(0.1,reciprocal);
    }

    @Test
    void convertRadix() {
        Practice1 practice1 = new Practice1();
        String converted = practice1.convertRadix(10, 2);

        assertEquals("1010", converted);
    }
}
