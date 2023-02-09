package 네트워크예제2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkEx2 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(); // 포트 바인딩을 위해서 서버 소켓을 생성
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
        //bind시 IP와 port 번호를 입력하는데, 대부분의 경우 IP는 localhost 지정, 멀티IP인 경우
            while(true) {
                System.out.println("연결 대기");
                Socket socket = serverSocket.accept(); // 연결 요청을 수락함
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 요청 수락]" + isa.getHostName());
            }
        } catch(Exception e) {}
        if(!serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch(IOException e) {}
        }
    }
}

