package ch07.sec05;

import java.util.BitSet;

public class BitsetDemo {
    public static void main(String[] args) {
        // 이 프로그램은 소수를 찾는 방법인 에라토스테네스의 체를 보여준다.
        int n = 100000;
        BitSet primes = new BitSet(n + 1);
        for (int i = 2; i <= n; i++)
           primes.set(i);
        for (int i = 2; i * i <= n; i++) {
           if (primes.get(i)) {
              for (int k = 2 * i; k <= n; k += i)
                 primes.clear(k);
           }
        }
        System.out.println(primes);
    }
}
