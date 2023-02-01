package 쓰레드예제9번;

import static java.lang.Thread.sleep;

//데몬쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드
//다른 쓰레드가 모두 종료되면 자동으로 종료된다.
//start() 메소드를 호출하기 전에 setDaemon(true)를 호출하면 됨
public class ThreadEx9 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        sleep(20000);
    }
}
class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장합니다.");
    }
    @Override
    public void run() {
        while(true) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}