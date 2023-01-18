package 추상클래스응용;
//추상클래스 만들기
//추상 클래스는 일반 멤버와 메소드를 포함할 수 있음.
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) {
        this.name = name;
    }
    void setPower(boolean power) {
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power On");
        } else {
            System.out.println("Phone Power Off");
        }
    }
    abstract void call(); // 상속받은 클래스에서 반드시 오버라이딩해서 기능을 완성해야 함.
}

