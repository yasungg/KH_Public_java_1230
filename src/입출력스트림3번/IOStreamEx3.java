package 입출력스트림3번;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOStreamEx3 {
    public static void main(String[] args) throws IOException {
        //Writer는 문자 스트림의 최상위 클래스
        Writer writer = new FileWriter("test.txt.txt");
        //char[] data = "안유진".toCharArray(); // 문자열을 charArray로 바꿈
        String data = "안유진 다리는 건조합니다.";
        writer.write(data);
        /*for(int i = 0; i < data.length; i++) {
            writer.write(data[i]);*/
        //writer.write(data);
        writer.flush();
        writer.close();
    }
}
