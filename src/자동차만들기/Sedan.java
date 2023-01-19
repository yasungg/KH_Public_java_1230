package 자동차만들기;

public class Sedan extends Vehicle{
    public Sedan(String name) {
        this.name = name;
        maxSpeed = 200;
        fuelTank = 45;
        fuelEff = 12;
        seatCnt = 4;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt +=1;
    }
}
