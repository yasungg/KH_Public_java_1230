package 쓰레드예제6번;
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
//경우에 따라 두 개의 쓰레드가 번갈아가면서 실행되어야 하는 경우
// 쓰레드가 작업이 완료되면 notify() 메소드 호출해서 일시정지에 있는 다른 쓰레드 깨움
//자신은 wait() 상태로 전환 wait() 로 깨어난 쓰레드는 작업 진행
public class ThreadEx6 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA thA = new ThreadA(sharedObject);
        ThreadB thB = new ThreadB(sharedObject);
        thA.start();
        thB.start();
    }

}
