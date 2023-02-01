package 숫자의합;

import java.util.Scanner;

//문제 : n개의 숫자가 공백없이 쓰여있음. 이 숫자를 모두 합해서 출력하는 문제
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String num = sc.next();
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
