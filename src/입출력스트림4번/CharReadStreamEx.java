package 입출력스트림4번;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//Reader : 문자 기반 입력 최상위 클래스로 추상 클래스.
//모든 문자 기반의 입력 스트림은 Reader를 상속받아서 만든다.
public class CharReadStreamEx {
    //read() : 입력 스트림으로부터 한 개의 문자(2byte)를 읽고 4바이트 int 타입으로 반환
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("sre/text.txt");
        int readData;
        char[] cBuf = new char[10];
        String data = "";
        while(true) {
            readData = reader.read(cBuf);
            if(readData == -1) break; // -1 더이상 읽을 길이 없는 경우를 의미
            data += new String(cBuf, 0, readData);
            //System.out.println((char)readData);//read()는 int타입으로 반환하므로 출력할 때 반드시 원하는 타입으로 형변환을 해주어야 한다.
        }
        reader.close(); // 입력 스트림을 사용하고 난 뒤 스트림을 닫아야 함.
    }
}
