package 쓰레드예제2번;

import static java.lang.Thread.sleep;

//쓰레드 생성 방법 :
// 1. Thread 클래스를 상속받는 방법
//구현 자체는 이 방법이 더 쉽다. 하지만 쓰레드를 상속받았기 때문에 다른 클래스의 상속이 불가.
// 2. Runnable 인터페이스 구현하는 방법
//확장성이 더 좋은 방법 다른 클래스로부터 상속을 받을 수 있다.
// 3. Runnable 인터페이스를 이용한 익명의 개체로 구현
// 4. Runnable 인터페이스를 이용한 람다식으로 구현
public class ThreadEx2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Sample();
        Thread thread1 = new Thread(task); // 실제 쓰레드가 생성됨.
        Thread thread2 = new Thread(task);
        thread1.start(); // start() 메소드 호출 시 자신의 run() 메소드를 실행
        thread1.setPriority(10); // 1~10값으로 우선순위를 매긴다. 10이 가장 높음.
        thread2.start();

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    sum += i;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);
            }
        };
        Thread thread3 = new Thread(task2);
        thread3.start();

        Runnable task3 = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                sum += i;
                System.out.println("" + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };
        for (int i = 0; i < 100; i++) {
            sleep(1);
            System.out.println("여기는 메인입니다.");

        }
    }
}

class Sample implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            sum += i;
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}