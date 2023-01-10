package 간판만들기;

import java.util.Scanner;

//임의의 숫자를 입력받음. : 120
//120에 대한 차지하는 공간을 계산하는 것
// 0 = 4칸, 1 = 2칸, 그 외에 3칸
//120 => 1 + 2 + 1 + 3 + 1 + 4 + 1 =>13
//100 => 1 + 2 + 1 + 4 + 1 + 4 + 1 =>14
//5611 => 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1=>15
//0 입력되기 전까지는 반복 수행해야 함.
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sign = ""; //문자열을 입력받기 위한 변수
        int sum = 0; //입력된 숫자의 총 자릿수
        int[] signSize = {4,2,3,3,3,3,3,3,3,3};

        while (true) {
            System.out.print("숫자를 입력하세요. : ");
            sign = sc.next();
            if(sign.equals("0")) break;
            for(int i = 0; i < sign.length(); i++) {
                sum += signSize[sign.charAt(i) - '0'] + 1; // << 여기 이해안됨
            }
            System.out.println(sum + 1); //숫자 맨 앞의 여백을 계산.
            sum = 0;
        }
    }
}