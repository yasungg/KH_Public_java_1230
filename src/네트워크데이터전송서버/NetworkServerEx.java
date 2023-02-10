package 네트워크데이터전송서버;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkServerEx {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localHost", 5001));
        while(true) {
            System.out.println("[연결 대기중]");
            Socket socket = serverSocket.accept();
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[연결 수락" + isa.getHostName());

            byte[] bytes = null;
            String message = null;
            OutputStream os = socket.getOutputStream();
            message = "안녕하세요, 클라이언트님 !!!";
            bytes = message.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[데이터 전송 완료]");

            InputStream is = socket.getInputStream();//소켓으로부터 입력받기
            bytes = new byte[100];
            int readByteCnt = is.read(bytes);
            message = new String(bytes, 0, readByteCnt, "UTF-8");
            System.out.println("메시지 수신 완료 : " + message);

            os.close();
            is.close();



        }

    }
}
