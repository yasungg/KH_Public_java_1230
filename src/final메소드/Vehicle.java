package final메소드;

public class Vehicle {
    int speed;
    String color;
    String name;
    final void accelerator() { // 상속을 하되 특정 기능의 오버라이딩을 금지시킨다.
        System.out.println(name + "의 속도를 증가시킵니다.");
    }
    void breakPanel() {
        System.out.println(name + "의 속도를 감소시킵니다.");
    }
}
class SportsCar extends Vehicle {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "red";
    }
    int getSpeed() {
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean isTurbo() {
        return isTurbo;
    }
    void setTurbo(boolean isTurbo0) {
        this.isTurbo = isTurbo;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo());
    }
}

class ElectricCar extends Vehicle {
    boolean isAutoDrv; // 자율주행
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean isAutoDrv() {
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행모드 : " + isAutoDrv());
    }
}


