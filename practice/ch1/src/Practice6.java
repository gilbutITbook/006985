// BigInteger 를 사용해 팩토리얼을 계산하는 프로그램을 작성하라.

import java.math.BigInteger;

public class Practice6 {
    public BigInteger bigIntegerFactorial(BigInteger bigInteger) {
        BigInteger result = new BigInteger("1");

        while (!bigInteger.equals(new BigInteger("0"))) {
            result = result.multiply(bigInteger);

            bigInteger = bigInteger.subtract(new BigInteger("1"));
        }

        return result;
    }
}
