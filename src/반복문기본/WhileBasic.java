package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("값을 입력하세요. : ");
        int number = sc.nextInt();
        /*while(number > 0) {
            sum += number;
            number--;*/
        for(int i = 1; i < number; i++) {
            sum += 1;
        }
        System.out.println("입력받은 정수의 합은 " + sum + "입니다.");
    }

}
