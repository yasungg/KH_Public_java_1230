package 자동차만들기;

public class SportsCar extends Vehicle {
    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuelTank = 30;
        fuelEff = 8;
        seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}
