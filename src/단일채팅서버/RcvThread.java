package 단일채팅서버;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;

public class RcvThread extends Thread {
    private final Socket socket;

    public RcvThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream buf = new DataInputStream(socket.getInputStream());
            String rcvString;
            while(true) {
                rcvString = buf.readUTF();//바이트 단위의 스트림을 자바 데이터 타입으로 변환, 문자열로 읽어냄
                System.out.println(" 상대방 : " + rcvString);
            }
        } catch(SocketException e1) {
            System.out.println("상대방의 연결이 종료되었습니다.");
        } catch(IOException e2) {
            e2.printStackTrace();
        }

    }
}
