package 인터페이스복습;

import java.util.Scanner;

public class InterfaceFinalEx {
    public static void main(String[] args) {
        NetAdapter adapter;
        CocoaTalk cocoaTalk = new CocoaTalk("박채영");
        Scanner sc = new Scanner(System.in);
        System.out.print("[1]Wi-Fi, [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) {
            adapter = new WiFi();
        } else {
            adapter = new FiveG();
        }
        cocoaTalk.writeMsg("잘 지내?");
        cocoaTalk.connect(adapter);
        cocoaTalk.send(adapter);
    }
}
class CocoaTalk {
    private String to;
    private String msg;
    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void connect(NetAdapter adapter) {
        adapter.connect();
    }
    public void send(NetAdapter adapter) {
        adapter.send(msg);
    }
}
interface NetAdapter {
    void connect();
    void send(String msg);
}
class WiFi implements  NetAdapter {
    @Override
    public void connect() {
        System.out.println("Wi-Fi 연결이 성공되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G 연결이 성공되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}
