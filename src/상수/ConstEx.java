package 상수;
//상수란? 변수와 마찬가지로

import java.util.Scanner;


public class ConstEx {
    public static void main(String[] args) {
        final double TAXRATE = 0.10; // 세율 10%
        Scanner sc = new Scanner(System.in); // 키보드로 입력을 받기 위해 스캐너 객체를 생성
        System.out.println("수입을 입력하세요 : ");
        int income = sc.nextInt(); //키보드로부터 정수값을 입력받아서 income 변수에 대입
        System.out.println("당신이 내야 할 세금은 " + (income * TAXRATE));
    }
}
