package 문자열자르기;

import java.util.Scanner;

//시간 입력 받음. 23:39:59
//시간 입력 : 12:3:1 12시 03분 01초
//출력 : 오후 11시 30분 59초
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요. : ");
        String time = sc.next();


        String[] splitTime = time.split(":");
        String hr = "";
        String min = "";
        String sec = "";
        String amPm = "";

        int intHour = Integer.parseInt(splitTime[0]);
        if(intHour > 11) {
            amPm = "오후";
            intHour -= 12;
        } else amPm = "오전";

        if(splitTime[0].length() == 1) hr = "0" + splitTime[0];
        else hr = splitTime[0];
        if(splitTime[1].length() == 1) min = "0" + splitTime[1];
        else min = splitTime[1];
        if(splitTime[2].length() == 1) sec = "0" + splitTime[2];
        else sec = splitTime[2];

        System.out.println("현재 시각은 " + amPm + " " + hr + "시 " + min + "분 " + sec + "초입니다.");
    }
}
