package PC방알바;

import java.util.Scanner;

public class PcRoomMain {
    public static void main(String[] args) {
        int[] seat = new int[100];
        Scanner sc = new Scanner(System.in);
        int rjct = 0;
        PcRoomEx pcroomEx = new PcRoomEx();
        System.out.print("방문 인원을 입력하세요. : ");
        int visit = sc.nextInt();
        for(int i = 0; i < visit; i++) {
            System.out.print("원하시는 좌석을 입력하세요. : ");
            int seatNum = sc.nextInt();
            if(seat[seatNum-1] == 1) rjct++;
            else seat[seatNum-1] = 1;
        }
        System.out.println(rjct + "명의 거절된 인원이 있습니다.");
    }
}
