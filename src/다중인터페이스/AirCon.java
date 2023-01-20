package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // 상수를 쓸 땐 관례상 모두 대문자로 사용한다. 인터페이스 내부에 있는 변수에는 public final static이 자동으로 붙는다.
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 추상메소드화. 실제로는 public abstract void airConON();
    void aicConOff();
    void setAirConTemp(int tmp);
}
