package 윤년구하기;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt(); // 키보드로부터 연도를 입력 받음.
        if((year % 4 == 0) && (year % 100 != 0) ||  (year % 400 == 0)) {
            System.out.println(year + "년은 윤년이 맞습니다.");//참인 경우 수행된다.
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");//거짓인 경우 수행된다.
        }
    }
}
