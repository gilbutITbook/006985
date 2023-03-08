import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Practice6Test {
    @Test
    void bigIntegerFactorial() {
        Practice6 practice6 = new Practice6();
        BigInteger result = practice6.bigIntegerFactorial(new BigInteger("4"));

        assertEquals(new BigInteger("24"), result);
    }
}
