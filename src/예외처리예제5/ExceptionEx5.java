package 예외처리예제5;

import java.io.IOException;

//예외처리 미루기 : 해당 메소드 안에서 예외처리에 대한 부분을 메소드를 호출한 상위로 떠넘김
//예외처리는 발생한 곳에서 처리하는게 원칙이나, 묶어서 호출한 곳에서 한번에 처리하는 것
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample io = new IOSample();
        try {
            io.input();
            io.output();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }
}