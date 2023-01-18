package 상속과인터페이스;

import java.util.Scanner;

//상속과인터페이스 함께 사용하기
public class InheritanceAndInterface {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택하세요. [1] WiFi [2] 5G : ");
        int network = sc.nextInt();
        if(network == 1) {
            WiFi wifi = new WiFi("KT megapass", "고유림");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else {
            FiveG fiveg = new FiveG("SK telecom", "백이진");
            fiveg.connect();
            fiveg.sendMsg();
            fiveg.rcvMsg();
        }
    }
}
