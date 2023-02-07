package 입출력스트림1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//바이트 출력 스트림 : 바이트 단위로 데이터를 전송, 속도가 빠름. 사진, 동영상 등 전송
//바이트 스트림의 최상위 추상 클래스는 OutputStream
//FileOutputStream, BufferOutputStream, DatOutputStream, PrintOutputStream
//close() : 스트림을 닫음
//flush() : 스트림 버퍼의 내용을 모두 내보냄
//write() : 값을 출력
public class IOStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test0207.db");
        byte[] arr = {10, 20, 30, 40, 50};
        os.write(arr, 1, 3); // 배열 1번 인덱스부터 3개의 값을 출력
        /*byte a = 10;
        byte b = 20;
        byte c = 30;
        os.write(a); // 값을 출력
        os.write(b);
        os.write(c);*/ //write를 하고 나면 반드시 flush() 버퍼 비우기 작업을 해줘야 한다.
        os.flush();
        os.close(); // 작업을 하고 난 뒤 스트림을 닫아주어야 한다.
    }
}
