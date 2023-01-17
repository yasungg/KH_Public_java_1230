package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

//- 전원 ON/OFF 기능
//- 온도 설정 기능 (1도 단위 설정)
//- 현재 온도 표시 기능
//- 냉방기 ON/OFF 기능
//- 난방기 ON/OFF 기능
//- 바람세기 설정 (1단계 / 2단계 / 3단계)
public class AirconMain {
    boolean isPower;// 전원 on/off
    int setTemp; // 온도 설정 필드
    int currTemp; // 현재 온도
    boolean isCooler;// 에어컨 on/off
    boolean isHeater;// 난방기 on/off
    int windPower; // 바람세기 설정 (1단계 / 2단계 / 3단계)
    AirconMain() { // 생성자
        final int[] monthTemp = {-5, 3, 8, 15 , 20, 26, 32, 35, 24, 16, 8, -3};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // month는 지금이 몇월인지 정보를 가지고 옴
        //그 정보가 배열의 인덱스와 같음. ex 1월 = 0.
        currTemp = monthTemp[month];
        isPower = false; //전원에 대한 인스턴스 필드는 Off가 디폴트.
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windPower = 1;
    }
    //에어컨 정보 출력 온도가 바뀔때마다 출력
    void  airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String [] windStr = {"", "미풍", "약풍", "강풍"};
        System.out.println("==============에어컨 정보==============");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windPower]);
    }
    //에어컨 설정하기
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + "입니다.");
        System.out.print("온도를 설정하세요. : ");
        setTemp = sc.nextInt(); // 설정 온도를 입력받아 인스턴스필드(setTemp)에 저장
        System.out.println("설정 온도는 " + setTemp + "도 입니다.");
        System.out.print("바람 세기를 입력하세요.(1/2/3) : ");
        windPower = sc.nextInt();
        if(currTemp > setTemp) { // 현재가 덥다.
            System.out.print("쿨러가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if(currTemp < setTemp) { // 현재가 추운 상태.
            System.out.print("히터가 동작합니다.");
            isHeater = true;
            isCooler = false;
        } else {
            isHeater = false;
            isCooler = false;
        }
    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindPower() {
        return windPower;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    //현재온도 설정
    public void setCurrTemp(int n) {
        currTemp += n;
    }//현재온도 읽기
    public int getCurrTemp() {
        return currTemp;
    }//설정온도 읽기
    public int getSetTemp() {
        return setTemp;
    }


}
