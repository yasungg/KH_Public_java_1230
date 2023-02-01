package 쓰레드예제5번;
//join() : 다른 쓰레드가 결과를 완료할 때까지 기다렸다가 실행을 함.
public class ThreadEx5 {
    public static void main(String[] args) {
        SumThread sumTh = new SumThread();
        sumTh.start();
        try {
            sumTh.join(1);
        } catch(InterruptedException e) {}
        System.out.println("합 : " + sumTh.getSum());
    }
}
class SumThread extends  Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            sum ++;
        }
    }
}