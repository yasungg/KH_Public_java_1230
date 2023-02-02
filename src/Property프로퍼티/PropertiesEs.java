package Property프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

//Properties? 내부의 정보 저장용으로 사용되며, 키와 값이 모두 String 타입으로 제한된다./
//HashTable의 하위 클래스
public class PropertiesEs {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesEs.class.getResource("../database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("드라이버 : " + driver);
        System.out.println("URL : " + url);
        System.out.println("이름 : " + username);
        System.out.println("패스워드 : " + password);



    }
}
