package 코코아톡;

public class CocoaTalk {
    private String to; // 상대방 이름
    private String msg; // 전달할 메시지 내용
    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = msg;
    }
}
