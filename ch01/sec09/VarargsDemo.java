package ch01.sec09;

public class VarargsDemo {
    public static double average(double... values) {
        double sum = 0;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    }    
    
    public static double max(double first, double... rest) {
        double result = first;
        for (double v : rest) result = Math.max(v, result);
        return result;
    }
    
    public static void main(String[] args) {
        int n = 42;
        System.out.printf("%d\n", n);
        System.out.printf("%d %s\n", n, "widgets");
        
        double[] scores = { 3, 4.5, 10, 0 };
        double avg = average(scores);
        System.out.println(avg);
        double largest = max(3, 4.5, 10, 0);
        System.out.println(largest);
            // average()는 0을 반환하지만 max()는 컴파일되지 않는다.
    }
}
