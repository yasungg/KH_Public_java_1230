package 자동차만들기;

public class Driver {
    void drive(Vehicle car, int passCnt, int dist, boolean mode) {
        if(mode) car.setMode(mode);
        int moveCnt = car.getMovingCnt(dist, passCnt);//승객의 수를 입력받아 이동 횟수를 구함
        System.out.println("총 비용 : " + car.getTotalCost(dist, moveCnt));
        System.out.println("총 주유 횟수 : " + car.getReFuelCnt(dist, moveCnt));
        System.out.printf("총 시간 : %.3f\n", car.getMovingTime(dist, moveCnt));

    }
}
