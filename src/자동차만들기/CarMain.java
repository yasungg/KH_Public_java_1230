package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300};
        Vehicle car = null;
        Driver driver = new Driver();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        int city = sc.nextInt();
        System.out.println("이동할 승객 수 입력 : ");
        int passCnt = sc.nextInt();
        System.out.println("이동할 차량 선택 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int carSel = sc.nextInt();
        System.out.println("부가 기능 사용 여부 입력 [1]on [2] off : ");
        int option = sc.nextInt();
        boolean isMode = (option ==1) ? true : false;
        switch(carSel) {
            case 1 : car = new SportsCar("Ferrari"); break;
            case 2 : car = new Sedan("G90"); break;
            case 3 : car = new Bus("Tayo"); break;
            default : System.out.println("차량 선택이 잘못되었습니다.");
        }
        driver.drive(car, passCnt, dist[city], isMode);
    }
}
