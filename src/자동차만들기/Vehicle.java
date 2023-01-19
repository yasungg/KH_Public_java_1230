package 자동차만들기;

public abstract class Vehicle {
    int fuelTank;
    int maxSpeed;
    int fuelEff;
    int seatCnt;
    String name;
    abstract void setMode(boolean isMode);
    int getMovingCnt(int passCnt, int moveCnt) { // 이동 횟수 구하기 : 입력값으로 승객의 수가 필요
        if(passCnt % seatCnt != 0) return(passCnt / seatCnt) + 1;
        else return passCnt / seatCnt;
    }
    int getTotalCost(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }
    int getReFuelCnt(int dist, int moveCnt) {
        if(((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        else return (((dist) * moveCnt) / fuelEff) / fuelTank;
    }
    double getMovingTime(int dist, int moveCnt) {
        return (double)dist * moveCnt / maxSpeed;
    }
    Vehicle() {}
}
