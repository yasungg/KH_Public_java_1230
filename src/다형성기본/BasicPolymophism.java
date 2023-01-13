package 다형성기본;
//부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조.
//단, 부모클래스에 존재하는 메소드만 접근이 가능하다.
//
public class BasicPolymophism {
    public static void main(String[] args) {
        Child child = new Child(); // 자식 클래스의 참조변수로 자식 클래스의 인스턴스(객체) 참조
        child.display();
        child.out();
        Parents parents = new Child();
        parents.display();
        ((Child)parents).out(); // 형변환으로 접근
    }
}
class Parents {
    protected int num; //부모, 자식, 같은 패키지 내에서 접근 가능

    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
class Child extends Parents {
    private int x = 100; //같은 클래스 내에서만 접근 가능한 변수
    public Child() {}
    public void out() {
        System.out.println("부모의 protected num 필드 : num");
        System.out.println(("자식 클래스의 out() 메소드"));
    }
    @Override
    public void display() {
        System.out.println("상속받아 재정의한 메소드");
    }
}
class Child2 {
    private int y = 200;
    public Child2() {
    }
    public void out() {
        System.out.println("부모의 protected num 필드 : num");
        System.out.println(("자식 클래스의 out() 메소드"));
    }
    public void display() {
        System.out.println("상속받아 재정의한 메소드");
    }
}