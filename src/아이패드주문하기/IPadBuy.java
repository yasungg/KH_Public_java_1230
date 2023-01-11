package 아이패드주문하기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadBuy {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            IPadInfo iPad = new IPadInfo();
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductionPad();
            iPad.viewProductPad();
        }
    }

}
class IPadInfo {
    int screen; // 화면 크기. 11인치 인스턴스 필드
    int color; // 색상
    int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네읕워크 : Wi-Fi, Wi-Fi+Cellular
    String name; // 각인 서비스 신청 시 이름 저장
    String productDate; // 제품생산일자
    String serialNum; // 일련번호
    static int cnt = 0;
    // 클래스 변수(객체 생성 시 생성되지 않고 클래스에 소속된 변수

    IPadInfo() { // 생성자
        this.name = name;
        Date now = new Date(); // 시간정보 가져오기 위해 Date 클래스 객체로 생성
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);//연월일 정보를 얻어서 인스턴스 변수에 저장
        cnt++;
        productDate += cnt;
    }
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============iPad Pro 구매하기===============");
        System.out.println("구입하시려면 yes / 종료는 quit");
        String isProduct = sc.next();
        if(isProduct.equalsIgnoreCase("yes")) return true;
        else return false;
    }

    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 [1] 11인치, [2] 12.9인치");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택하세요.");
        }
    }

    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택 [1] 스페이스그레이 [2] 실버");
            color = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("컬러를 다시 선택하세요.");
        }
    }

    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1] 128GB, [2], 256GB, [3] 512GB, [4] 1TB");
            color = sc.nextInt();
            if (screen > 1 || screen < 5) return;
            System.out.println("용량을 다시 선택하세요.");
        }
    }
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("네트워크 선택 [1] Wi-Fi [2] Wi-fI + Cellular");
            color = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("네트워크를 다시 선택하세요.");
        }
    }
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청하시겠습니까?");
        String service = sc.next(); // 각인 서비스 신청 여부를 묻는 문자열
        if(service.equalsIgnoreCase("yes")) {
            System.out.print("각인 문구를 입력하십시오.");
            name = sc.next();
        }
    }
    //시리얼넘버란? 제품의 고유번호이며 제품마다 유일한 값을 가짐
    // iPad+ 11/13(인치) + 128/256/512/1024(용량) + W/C(네트워크) + Date +생산대수
    void setSerialNum() {
        String scrStr = (screen ==1 ) ? "11" : "13";
        String[] memoryStr = {"", "128", "256", "512", "1024"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + scrStr + memoryStr[memory] + networkStr + productDate;
    }
    void inProductionPad() throws InterruptedException {
        int cnt = 0;
        while(true) {
            sleep(300); // 1000 millis = 1초. 300은 0.3초를 의미
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%]");
            System.out.print("\r");
            if(cnt == 100) break;
        }
    }
    void viewProductPad() {
        final String[] screenType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memoryType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi + Cellular"};
        System.out.println("========iPad Pro가 출고되었습니다 =========");
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memoryType[memory]);
        System.out.println("네트워크 타입 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("-----------------------------------------");
    }
}