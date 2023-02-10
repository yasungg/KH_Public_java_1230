package 명함전송클라이언트;

import java.io.*;

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.rmi.UnexpectedException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameCardClient {
    static Map<String, NameCard> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("연결을 요청합니다.");
            socket.connect(new InetSocketAddress("localHost", 7877));
            System.out.println("상대방이 연결을 수락했습니다.");
        } catch(ConnectException e1) {
            System.out.println("연결이 종료되었습니다.");
        } catch(UnexpectedException e2) {
            System.out.println("알 수 없는 서버");
        }catch (IOException e3) {
            e3.printStackTrace();
        }
        if(socket != null) {

            nameCardSave();
            OutputStream sendNC = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(sendNC);
            nameCardWrite();

            oos.writeObject(oos);
            oos.flush();
            oos.close();
        }
    }
    static void nameCardWrite() {
        map.put("곽용석", new NameCard("곽용석", 30, "01030142096", "dragxn1026@gmail.com"));

    }
    static void nameCardSave() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("휴대폰 번호 : ");
            String phone = sc.next();
            System.out.println("이메일 주소 : ");
            String eMail = sc.next();
            map.put(name, new NameCard(name, age, phone, eMail));
        }
    }
}

