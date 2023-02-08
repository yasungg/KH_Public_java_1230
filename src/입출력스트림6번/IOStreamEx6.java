package 입출력스트림6번;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class IOStreamEx6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/입출력스트림6번/test.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis); // 스캐너 입력으로 파일을 읽어들임.
        while(sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
