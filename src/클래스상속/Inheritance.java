package 클래스상속;

//상속 : 부모 클래스의 기능(필드, 메소드)를 그대로 물려받는 것
//접근제한자 특성에 영향을 받음
public class Inheritance {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy");
        houseDog.sleep();
    }
}
