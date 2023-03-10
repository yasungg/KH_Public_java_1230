package 입출력스트림9번;

import java.io.*;

//기본 타입 입출력 보조 스트림 : 바이트 스트림은 바이트 단위의 입출력이므로
//자바의 기본 데이터타입인 boolean, char, short, int, long, float, double 단위로 입력 불가
//DataInputStream과 DataOutputStream을
public class TypeAssistantStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("남해이");
        dos.writeDouble(99.5);
        dos.writeInt(1);

        dos.writeUTF("남행선");
        dos.writeDouble(71.5);
        dos.writeInt(2);

        dos.writeUTF("최치열");
        dos.writeDouble(62.7);
        dos.writeInt(3);
        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i = 0; i < 3; i++) {
            String name = dis.readUTF();
            Double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println( name + " : " + score + " (" + order + ")");
        }
        dis.close();
    }
}
