package 쓰레드예제7번;

import java.util.Scanner;

//쓰레드의 안전한 종료(Stop 플래그, interrupt())
public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
        /*RunThread runThread = new RunThread();
        runThread.start();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String tmp = sc.next();
            if(tmp.equalsIgnoreCase("exit")) {
                runThread.setStop(true);
                break;
            }
        }*///플래그를 만들어서 종료
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(5000);
        interruptThread.interrupt();//인터럽트 사용해서 종료
    }
}
