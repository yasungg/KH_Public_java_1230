package Vector클래스;

import java.util.List;
import java.util.Vector;

//ArrayList : 동적 배열(개수를 정할 필요가 없고 값이 추가될 때마다 사이즈가 커짐)
//검색은 매우 빠르나, 삽입/삭제는 매우 느리다. 동기화를 지원하지 않음(멀티쓰레드 환경에서 동작X)
//Vector : 동적 배열, 물리적으로 연속된 공간, 내부적으로 ArrayList와 구조가 동일.
//동기화를 지원한다. 따라서 매우 느리다. 임계 영역?
//LinkedList : 물리적으로 연속되어있지 않다. 양방향 LinkedList 검색은 느리나 삽입/삭제가 빠르다.
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> vector = new Vector<>();
        vector.add(new NameCard("박채영", "rosesarerosie@instagram.com", "01022982096", "singer"));
        vector.add(new NameCard("유지민", "karina@instagram.com", "01033762096", "singer"));
        vector.add(new NameCard("김지수", "jisooo____@instagram.com", "01057892096", "singer"));
        vector.add(new NameCard("이미주", "mijoo@instagram.com", "01058772096", "singer"));

        for(NameCard e : vector) {
            System.out.println("이름 " + e.name);
            System.out.println("메일 " + e.mail);
            System.out.println("휴대폰 " + e.phone);
            System.out.println("직업 " + e.jobs);
            System.out.println(" ");
        }
    }

}
class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}