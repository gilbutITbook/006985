package ch01.sec04;

public class ArithmeticDemo {
    public static void main(String[] args) {
        // 나눗셈과 나머지
        
        System.out.println(17 / 5);
        System.out.println(17 % 5);
        System.out.println(Math.floorMod(17, 5));
        
        System.out.println(-17 / 5);
        System.out.println(-17 % 5);
        System.out.println(Math.floorMod(-17, 5));
        
        // 증가와 감소
        
        int[] a = { 17, 29 };
        int n = 0;
        System.out.printf("%d %d\n", a[n++], n); 
        n = 0;
        System.out.printf("%d %d\n", a[++n], n);
        
        // 제곱과 제곱근
        
        System.out.println(Math.pow(10, 9));
        System.out.println(Math.sqrt(1000000));
        
        // 숫자 변환
        
        double x = 42;
        System.out.println(x); // 42.0
        
        float f = 123456789;
        System.out.println(f); // 1.23456792E8
        
        x = 3.75;
        n = (int) x;
        System.out.println(n); // 3
        
        n = (int) Math.round(x); 
        System.out.println(n); // 4
        
        System.out.println('J' + 1); // 75
        char next = (char)('J' + 1); 
        System.out.println(next); // 'K'
        
        n = (int) 3000000000L; 
        System.out.println(n); // -1294967296
    }
}
