package 다중인터페이스;

public class SportsCar extends Car implements AirCon, AutoDrive{
    private boolean isAirCon;
    private int setTemp;
    private boolean isAutoDrv;
    private  int speed;
    private String color;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, int speed, String color, String year, boolean isTurbo) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }
    public void viewInfo() {
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("희망 온도 : " + setTemp);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("자율 주행 : " + isAutoDrv);
        System.out.println("터보 모드 : " + isTurbo);



    }

    private String year;
    private boolean isTurbo;
    @Override
    public void airConON() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void aicConOff() {
        System.out.println("에어컨을 끕니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.println("에어컨의 설정 온도를" + setTemp +"도로 설정하였습니다.");
    }

    @Override
    public void autoDriveOn() {
        System.out.println("자율주행모드 ON");
    }

    @Override
    public void autoDriveOff() {
        System.out.println("자율주행모드 OFF");
    }
}
