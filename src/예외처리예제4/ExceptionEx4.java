package 예외처리예제4;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//finally : 프로그램 실행 도중에 예외상황이 발생하면 catch 구문이 수행된다.
//하지만 예외처리 발생 여부와 관계없이 항상 수행되어야 하는 구문이 있는 경우 finally로 처리한다.
public class ExceptionEx4 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("text.txt");
            f.write("test");
        } catch(IOException e) {
            e.printStackTrace(); // 예외처리 발생 당시의 Call Stack에 있던 결과값을 화면에 출력
        } finally {
            if(f !=null) {
                try {
                    f.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

