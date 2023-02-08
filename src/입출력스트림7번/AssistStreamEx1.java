package 입출력스트림7번;

import java.io.*;

//보조스트림 : 데이터를 변형해서 입출력하고자 하거나, 데이터의 출력 형식을 지정하고 싶은 경우
//그리고 성능 개선이 필요한 경우에 사용한다.
//InputStreamReader : 문자의 인코딩 방식을 지정할 때 사용.
//보조스트림은 메인스트림과 연결되어야 한다.
public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
        /*InputStream is = System.in;//콘솔 입력받음
        Reader reader = new InputStreamReader(is);//보조스트림. 기본 인코딩 사용.
        int readCharNo;
        char[] cBuffer = new char[100];
        while ((readCharNo = reader.read(cBuffer)) != -1) {
            String data = new String(cBuffer, 0, readCharNo);
            System.out.println(data);
        }
        reader.close();*/
        FileOutputStream fos = new FileOutputStream("src/입출력스트림6번/file.txt");
        Writer writer = new OutputStreamWriter(fos); // FileOutputStream(byte)를 문자출력으로 변환함.


    }

}
