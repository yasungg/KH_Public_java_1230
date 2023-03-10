package 십진수이진수;

import java.util.Scanner;

// 입력받은 10진수를 2진수로 변환하고 다시 10진수로 변환하기
// 알아야 할 것 :
public class DecToBinEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("이진수 : " + val);
        val = binToDec(val);
        System.out.println("십진수 : ");
    }
    static int decToBin(int dec) {
        int bin;//계산으로 만들어진 이진수
        int sum = 0;//이진수로 구해진 최종 결과값
        int pos = 1;//계산된 결과를 넣을 위치
        while(dec != 0) {
            bin = dec % 2;
            sum = sum + bin * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return sum;
    }
    static int binToDec(int bin) {
        int dec = 0, i = 0, tmp = 0;
        while(bin != 0) {
            tmp = bin % 10; // 최하위 비트의 값을 10으로 나눈 값
            bin = bin / 10;
            dec += tmp * Math.pow(2, i++);
        }
        return dec;
    }
}
