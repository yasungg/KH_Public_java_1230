package 단일채팅서버;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
    private final Socket socket;

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());

            while(true) {
                String sendString = sc.nextLine();
                sendWriter.writeUTF(sendString);
                sendWriter.flush();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
