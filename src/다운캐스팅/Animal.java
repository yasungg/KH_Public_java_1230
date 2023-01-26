package 다운캐스팅;

public class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 걷습니다.");
    }
    public void readBook() {
        System.out.println("책을 읽습니다.");
    }
}
class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("사냥을 합니다.");
    }
}
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("날아갑니다.");
    }
    public void flying() {
        System.out.println("날갯짓을 합니다.");
    }
}