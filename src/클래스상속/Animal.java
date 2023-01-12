package 클래스상속;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
//Animal로부터 Dog가 상속을 받아서 클래스 생성
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "잠을 잡니다.");
    }
}
class HouseDog extends Dog {
    @Override
    void sleep() {
        System.out.println(name + "오랫동안 잠을 잡니다.");
    }
    void sleep(int hour) {
        System.out.println(name + "가 " + hour + "시간 동안 잠을 잡니다.");
    }
}