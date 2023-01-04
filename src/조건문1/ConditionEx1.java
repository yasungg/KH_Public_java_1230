package 조건문1;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("정수를 입력하세요. : ");
        int number = sc.nextInt();
        if (number > 100) {
            System.out.println(number + "(은)는 100보다 큽니다.");
        } else if (number < 100) {
            System.out.println(number + "(은)는 보다 작습니다.");
        } else {
            System.out.println(number + "는 100입니다.");*/
        System.out.print("영문자를 입력하세요. ");
        char ch = sc.next().charAt(0); //입력받은 문자 중에서 첫번째 문자를 추출
        if(ch >= 'a' && ch <= 'z') { //char는 정수값(아스키 코드값)으로 움직인다.
            System.out.println(ch + "는 소문자입니다.");
        } else if(ch <= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 대문자입니다.");
        } else {
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }
    }
}
