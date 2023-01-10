package 영화표예매;

import java.util.Scanner;

public class MovieSell {
    int[] seat = new int[10]; // 판매좌석 표시를 위해서 배열 생성

    void printSeat() { // 좌석판매상태를 보여줌
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }

    void selectSeat() { // 판매를 위해 좌석을 선택하는 메뉴
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석번호를 입력하세요. : ");
        int seatNum = sc.nextInt();
        if (seat[seatNum - 1] == 0) { //예약가능 여부 확인
            seat[seatNum - 1] = 1; //판매되었음을 표시.
            printSeat();
        } else {
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }
    int totalAmount() {
        int cnt = 0;
        for(int cost : seat) {
            if(cost == 1) cnt++;
        }
        return cnt * 12000;
    }
}