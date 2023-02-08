package 예외처리예제2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileNotFoundException : 파일에 접근하려 했는데 파일을 발견할 수 없을 때
//NullPointException : 참조하고 있는 객체가 없음을 의미함
public class ExceptionEx2 {
    public static void main(String[] args) {
        /*try {
            BufferedReader br = new BufferedReader(new FileReader("../database.properties"));
            br.readLine();
            br.close();
            System.out.println("프로그램 종료");
        } catch(IOException e) { // 입출력 관련 예외처리는 IOException으로 퉁친다.
            System.out.println("파일을 발견할 수 없습니다.");
        }
        System.out.println("시스템을 정상적으로 종료합니다.");*/
        //Test test.txt = new Test();
        Test test = null; // 참조변수가 참조하는 객체가 없음을 의미함
        //직접 수정하는 작업이 필요하다. 모든 NullPointException을 찾아서.
        String str = test.name;
        System.out.println(str);
    }
}
class Test {
    String name = "테스트";
}