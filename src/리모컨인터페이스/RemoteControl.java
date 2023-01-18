package 리모컨인터페이스;

public interface RemoteControl {
    int MaxVolume = 100; // 상수로 정의하지 않았지만 상수이며 재생성될 수도 없다.
    int MinVolume = 0; // final static이 자동으로 추가됨.
    void turnOn(); // 자동으로 추상메소드로 변경됨
    void turnOff();
    void setMaxVolume(int volume);
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음처리합니다.");
        else System.out.println("무음처리를 해제합니다.");
    }

}
