package 쓰레드예제8번;

import static java.lang.Thread.sleep;

public class ThreadEx8 {
    public static void main(String[] args) {
        SharedThread sharedThread = new SharedThread();
        Thread thread1 = new Thread(() -> {
            sharedThread.setValue(100);
        });
        Thread thread2 = new Thread(() -> {
            sharedThread.setValue(10);
        });
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}
class SharedThread {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + "의 Value값은 " + this.value);
    }
}
