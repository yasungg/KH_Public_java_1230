package 네트워크인터페이스;

public interface NetworkAdapter {
    void connect(); // 자동으로 public과 abstract가 붙음. 누구나 접근 가능한 추상메소드로 만들기 위함.
}
//implements는 인터페이스를 상속받는 예약어
class WiFi implements NetworkAdapter {
        String company;
        WiFi(String company) {
            this.company = company;
        }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
}
class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 5G망에 연결되었습니다.");
    }
}
class LTE implements NetworkAdapter {
    String company;
    LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 LTE망에 연결되었습니다.");
    }
}