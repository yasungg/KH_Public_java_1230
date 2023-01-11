package 생성자;

public class ConstructorEx {
    public static void main(String[] args) {
        Car ev6 = new Car(); //빈 생성자 호출
        Car santafe = new Car("Santafe");
        Car sorento = new Car("Sorento", "2020");
        Car G90 = new Car("Genesis G90", "2021", "Black");
        Car kona = new Car("Kona", "2023", "Blue", 200);

        ev6.getCar();
        santafe.getCar();
        sorento.getCar();
        G90.getCar();
        kona.getCar();
    }
}
class Car {
    String name;
    String year;
    String color;
    int maxSpeed;
    Car() {
    }
    //생성자 오버로딩 규칙은 매개변수 타입이나 갯수를 가지고 구분
    Car(String name) {
        this.name = name;
    }
    Car(String name, String year) {
        this.name = name;
        this.year = year;
    }
    Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }
    Car(String name, String year, String color, int maxSpeed) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    void getCar() {
        System.out.println("====Car Information====");
        System.out.println("이름 : " + name);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("최고속도 : " + maxSpeed);
    }
}
