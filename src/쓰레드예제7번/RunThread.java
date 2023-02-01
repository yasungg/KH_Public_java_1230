package 쓰레드예제7번;
//플래그를 이용해서 종료하는 방법
//true냐 false냐에 따라 프로그램 동작을 분개하는 것을 flag를 설정한다고 말함
public class RunThread extends Thread {
    private boolean stop; // stop 플래그 설정
    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        while(!stop) {
            System.out.println("Thread 실행중....");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("자원 정리....");
        System.out.println("실행 종료.");
    }
}
