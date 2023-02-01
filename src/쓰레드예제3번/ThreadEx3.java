package 쓰레드예제3번;

import java.awt.*;

//sleep() : 실행 중인 Thread를 일정 시간동안 멈추고싶을 때 사용.
//매개변수로 전달되는 시간은 mille second 단위. (1/1000초)
//전달된 시간이 경과되면 다시 Thread를 실행 대기 상태로 돌린다.
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 20; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
            }
        }
    }
}
