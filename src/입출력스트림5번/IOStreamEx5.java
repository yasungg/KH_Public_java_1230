package 입출력스트림5번;

import java.io.*;

public class IOStreamEx5 {
    public static void main(String[] args) {
        /*try {
            InputStream is = new FileInputStream("src/입출력스트림5번/IOStreamEx5.java");
            int data;
            while((data = is.read()) != -1) {
                System.out.write(data);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //FileOutputStream : 바이트 단위로 데이터를 파일에 저장할 때 사용하는 바이트 기반 출력 스트림.
        //바이트 단위로 저장하기 때문에 그림, 오디오, 텍스트 등 모든 종류의 데이터 파일을 저장할 때 사용.
        String originalFileName = "src/입출력스트림5번/MeinFuhrer.png";
        String targetFileName = "src/NoFuhrer.jpg";
        try {
            InputStream is= new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);
            int readByteNo;
            byte[] readBuffer = new byte[100];
            while((readByteNo = is.read(readBuffer)) != -1) { // readByteNo 몇 바이트 읽어야하는지 정보가 넘어옴.
                os.write(readBuffer, 0, readByteNo);
            }
            os.flush();
            os.close();
            is.close();
            System.out.println("복사가 성공적으로 진행되었습니다.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
