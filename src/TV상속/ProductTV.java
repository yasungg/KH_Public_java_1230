package TV상속;

public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isInternet;

    ProductTV() {
        super(true, 30, 30);
        name = "LG Smart TV";
    }

    ProductTV(String name) {
        isPower = false;
        channel = 10;
        volume = 10;
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    @Override
        // 오버라이딩 성립 여부를 컴파일러에게 확인하도록 요청함
        // 오버라이딩 : 부모가 물려준 특성을 재정의. 덮어씌움.
    void setChannel(int cnl) {
        if (cnl > 0 && cnl < 2000) {
            channel = cnl;
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }

    }

    void setChannel(int cnl, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            if (cnl > 0 && cnl < 2000) {
                channel = cnl;
            } else {
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }
    void setVolume(int vol) {
        if (vol > 0 && vol <= 100) this.volume = vol;
        else if (vol == 0) {
            System.out.println("음소거");
        } else System.out.println("음량 범위를 넘어섰습니다.");
    }
    void viewTV() {
        System.out.println("전원 : " + isPower);
        System.out.println("이름 : " + name);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);
    }
}