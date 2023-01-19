package 자동차만들기;

public class Bus extends Vehicle{
    public Bus(String name) {
        this.name = name;
        maxSpeed = 150;
        fuelTank = 100;
        fuelEff = 5;
        seatCnt = 20;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;

    }
}
