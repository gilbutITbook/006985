package ch01.sec02;

public class NumberDemo {
    public static void main(String[] args) {
        System.out.println(4000000000L); // long 리터럴
        System.out.println(0xCAFEBABE);  // 16진수 리터럴
        System.out.println(0b1001);      // 2진수 리터럴
        System.out.println(011);         // 8진수 리터럴
        
        // 리터럴에 밑줄 사용
        System.out.println(1_000_000_000); 
        System.out.println(0b1111_0100_0010_0100_0000);
        
        // 고급 주제: 부호 없는 수량
        System.out.println(Byte.toUnsignedInt((byte )-127));
        
        System.out.println(3.14F);    // float 리터럴
        System.out.println(3.14);     // double 리터럴
        System.out.println(3.14D);    // double 리터럴
        System.out.println(0x1.0p-3); // 16진수 double 리터럴

        // 무한대와 NaN
        System.out.println(1.0 / 0.0); 
        System.out.println(-1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        
        System.out.println(1.0 / 0.0 == Double.POSITIVE_INFINITY);
        System.out.println(-1.0 / 0.0 == Double.NEGATIVE_INFINITY);
        System.out.println(0.0 / 0.0 == Double.NaN);

        System.out.println(Double.isInfinite(1.0 / 0.0));
        System.out.println(Double.isNaN(0.0 / 0.0));
        System.out.println(Double.isFinite(0.0 / 0.0));
        
        // 반올림 오류
        
        System.out.println(2.0 - 1.1);
        
        // 문자 리터럴
        
        System.out.println('J'); 
        System.out.println('J' == 74); 
        System.out.println('\u004A'); 
        System.out.println('\u263A'); 
    }
}
