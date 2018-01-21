package ch05.sec01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryFinallyDemo {
    public static Lock myLock = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[2];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                try {
                    for (int k = 1; k <= 1000; k++) {
                        myLock.lock();
                        try {
                            counter++;
                            Thread.sleep(1);
                        } finally {
                            myLock.unlock();
                        }
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
        }
        for (Thread t : threads) t.start();
        
        // 다음과 같이 해보자: (1) 다음 줄의 주석을 해제한다.
        // threads[0].interrupt();
        // 프로그램을 실행한다. 무슨 일이 일어나는가? 그 이유는 무엇인가?
        // (2) try {, } finally {, } 줄을 주석 처리한다.
        // 프로그램을 실행한다. 무슨 일이 일어나는가? 그 이유는 무엇인가?
        
        for (Thread t : threads) t.join();
        System.out.println(counter);
    }
}
