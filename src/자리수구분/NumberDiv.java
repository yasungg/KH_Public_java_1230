package 자리수구분;

import java.util.Scanner;

//100의 자리 수를 입력받아서 3개(100의 자리/10의 자리/1의 자리)의 변수에 나누어 담기.
public class NumberDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();
        int a, b, c;
        a = number / 100;
        b = (number % 100) / 10;
        c = number % 10;
        System.out.println("100의 자리 : " + a);
        System.out.println("10의 자리 : " + b);
        System.out.println("1의 자리 : " + c);

    }
}
