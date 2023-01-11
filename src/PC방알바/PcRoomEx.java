package PC방알바;

import java.util.Scanner;

//피씨방에 피씨는 100대
//손님은 자신이 원하는 피씨 사용하고싶어한다
//손님의 수 입력 : 7
//손님이 선택한 좌석 번호 : 1 2 3 4 5 5 5
//거절 횟수 : 2
public class PcRoomEx {
    int[] seat = new int[100];

    void printSeat() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
    }
    void selectSeat() {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 좌석을 숫자를 입력하세요. : ");
        int seatNum = sc.nextInt();
        if (seat[seatNum - 1] == 0) { //예약가능 여부 확인
            seat[seatNum - 1] = 1; //판매되었음을 표시.
            printSeat();
        }
        else System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
    }
}