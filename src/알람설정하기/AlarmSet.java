package 알람설정하기;

import java.util.Scanner;

//상근이라는 친구가 있다. 이 친구는 매일 학교에 지각하곤 했다.
//보다 못한 창영이라는 친구가 지각하지 않는 방법을 알려주었다.
//알람을 설정하면 자동으로 시간으로 설정 시간보다 45분 일찍 알람이 울리도록 하였다.
//입력 시간은 시간과 분으로 입력 받기.
//입력받은 시간보다 45분 일찍 알람을 울리도록 설정한다.
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시를 입력하세요. : ");
        int hour = sc.nextInt();
        System.out.print("분을 입력하세요. : ");
        int minute = sc.nextInt();
        int sixtyhour = (hour * 60);
        int middlecase = sixtyhour + minute - 45;
        if(middlecase < 45) {
            middlecase = (24 * 60) - 45;
        }
        System.out.print(middlecase / 60 + " : " + middlecase % 60 + " WAKE UP!!");
        /*int calc = (hour * 60) + minute;
        if(calc < 45) {
            calc = (24 * 60) +minute;
        }
        calc -= 45;
        System.out.printf("%시%분\n", (calc / 60) + (calc % 60));*/

    }
}
