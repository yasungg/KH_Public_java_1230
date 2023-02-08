package 입출력스트림8번;

import java.io.*;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int data = -1; // 더이상 값이 없는 상태를 의미
        long start = 0;
        long end = 0;
        fis = new FileInputStream("src/입출력스트림8번/MeinFuhrer.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/NoFuhrer.png");
        start = System.currentTimeMillis();
        while((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close(); // bos를 통해 출력하는게 훨씬 빠르다.
        fis.close();
        bis.close();
        fos.close();
        System.out.println("버퍼를 사용하지 않는 경우의 시간 : " + (end - start) + "ms");
    }
}
