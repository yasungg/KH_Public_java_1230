package 매개변수의다형성;

import java.util.Scanner;

public class PolyDriver {
    public static void main(String[] args) {
        Driver drvier = new Driver("곽용석");
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        Truck truck = new Truck();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고싶은 차를 선택하세요. [1] 스포츠카, [2] 버스, [3] 트럭 : ");
        int sellCar = sc.nextInt();
        switch(sellCar) {
            /*case 1 : driver.drive(sportsCar); break;
            case 2 : driver.dirve(bus); break;
            case 3 : driver.drive(truck); break;*/
        }
    }
}
