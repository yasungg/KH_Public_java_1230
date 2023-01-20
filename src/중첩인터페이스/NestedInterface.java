package 중첩인터페이스;
import java.util.*;
//중첩 인터페이스는 클래스 내부에 선언한 인터페이스입니다.
//UI 프로그램에서 주로 쓰입니다.(안드로이드 등)
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListnener());
        button.touch();
        button.setOnClickListener(new MessageListnener());
        button.touch();
    }
}
