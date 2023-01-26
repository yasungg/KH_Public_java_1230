package 클론메소드;
// Cloneable 상속받아 구현해야 할 메소드는 없음.
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }

    //반환 타입이 Member 타입임
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); //형변환의 이유? 클론 메소드는
        } catch (CloneNotSupportedException e) {
        }
        return cloned;
    }
}
