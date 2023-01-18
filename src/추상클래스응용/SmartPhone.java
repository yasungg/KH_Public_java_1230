package 추상클래스응용;

public class SmartPhone extends Phone {
    SmartPhone(String name) {
        super("Galaxy S22");
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 완성 합니다.");

    }
    void Internet() {
        System.out.println("인터넷 기능을 추가합니다.");
    }
}
