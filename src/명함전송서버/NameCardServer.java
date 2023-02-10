package 명함전송서버;

import 명함전송클라이언트.NameCard;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.HashMap;
import java.util.Map;

//1. 명함 정보를 담을 클래스 형성
//2. List 형성 후 10명에 대한 명함 정보 입력
//3. NameCard Thread를 만들어서 연결 요청이 오는 클라이언트에 명함 전송하기
//4. 클라이언트는 서버에서 전송한 명함 정보를 출력하기.
public class NameCardServer {
    static Map<String, NameCard> map = new HashMap<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int port = 7877;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("연결 대기중..");
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println(" IP : " + serverSocket.getInetAddress() + "와 연결되었습니다.");
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            map = (Map<String, NameCard>) ois.readObject();

            ois.close();
        }





    }
}

