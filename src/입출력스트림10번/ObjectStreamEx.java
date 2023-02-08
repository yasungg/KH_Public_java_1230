package 입출력스트림10번;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//객체 입출력 보조 스트림 : 자바는 메-모리에 생성된 객체를 파일 또는 네트워크로 전송할 수 있다.
//객체는 문자가 아니기때문에 바이트 기반 스트링으로 출력해야 한다.
//객체를 출력하기 위해서 일렬로 연속적인 바이트로 변경해야 하는데, 이것을 직렬화라고 한다(Serialization)
//반대로 파일이나 네트워크로 전송된 객체를 읽을수도 있는데 이 때 연속적인 바이트를 객체로 복원하는 것을 이를 역직렬화라고 한다.
public class ObjectStreamEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board e : list) {
            System.out.println("번호 : " + e.getNumber());
            System.out.println("제목 : " + e.getTitle());
            System.out.println("장르 : " + e.getContent());
            System.out.println("작가 : " + e.getWriter());
            System.out.println("작성일 : " + sdf.format(e.getDate()));
            System.out.println("----------------------------------");
        }
    }
    static void writeList() throws IOException {
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "일타스캔들", "로맨틱코미디", "유제원", new Date()));
        list.add(new Board(2, "대행사", "오피스 드라마", "이창민", new Date()));
        list.add(new Board(3, "재벌집 막내아들", "경제 드라마", "정대윤", new Date()));

        FileOutputStream fos = new FileOutputStream("board.db"); // 실제 최종적으로 바이트로 쓰여짐
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 객체 출력 스트림을 이용해서 list를 출력
        oos.flush();
        oos.close();
    }
    static List<Board> readList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("board.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject();
        return list;
    }
}