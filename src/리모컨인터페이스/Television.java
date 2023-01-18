package 리모컨인터페이스;

public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setMaxVolume(int volume) {
        if(volume > MaxVolume) {
            System.out.println("입력한 볼륨이 최대치를 넘어섰습니다.");
            System.out.println("자동으로 최대치 100으로 조정합니다.");
            this.volume = RemoteControl.MaxVolume;
        } else if(volume < RemoteControl.MinVolume) {
            System.out.println("입력한 볼륨이 최소치를 미만입니다.");
            System.out.println("자동으로 최소치 0으로 조정합니다.");
            this.volume = RemoteControl.MinVolume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("텔레비전 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }
}
