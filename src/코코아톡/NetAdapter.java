package 코코아톡;

import 네트워크인터페이스.NetworkAdapter;

public interface NetAdapter {
    void connect();
    void send(String msg);
    }

class WiFi implements NetworkAdapter {
    @Override
    public void connect() {
    }
    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
    class FiveG implements NetworkAdapter {
        @Override
        public void connect() {
        }

        @Override
        public void send(String msg) {
            System.out.println(msg);
        }
    }
}