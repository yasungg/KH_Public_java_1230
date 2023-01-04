package 변수와데이터;

public class Datatype {
    public static void main(String[] args) {
        int num1, num2; // 같은 타입의 변수는 콤마(,)로 구분해서 동시에 선언 가능.
        String name = "곽용석";
        int hour = 3;
        int minute = 55;
        System.out.println(hour + "시" + minute + "분");
        System.out.println(name);
        NameCard ns = new NameCard();
        ns.name = "곽용석";
        ns.age = 30;
        System.out.println(ns.name);
    }
}
//사용자 정의 자료형
class NameCard {
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNumber;


}