package 클래스기본2;

public class ClassBasic2 {
    public static void main(String[] args) {
        Car g80 = new Car("제네시스G80", "White", 230);
        Car santafe = new Car();
        g80.viewCar();
        santafe.setName("산타페다다다"); // private 접근제한자를 걸면 setName을 이용해야한다.
        santafe.viewCar();
    }
}
