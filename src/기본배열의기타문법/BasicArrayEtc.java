package 기본배열의기타문법;
import java.util.Arrays;
//커맨더 라인 입력

public class BasicArrayEtc {
    public static void main(String[] args) {
        /* int[] score = new int[5]; // 국어, 영어, 수학, 사탐, 과탐
        for(int i = 0; i <= score.length; i++) { // 인덱스는 0부터 시작, 0,1,2,3,4인데 <=를 넣으면 5를 포함하게 된다.
            score[i] = 100;                      // 배열에 index 다음번째 값을 추가하게 되는 셈.
        }
        System.out.println(Arrays.toString(score));*/
        if(args.length !=2) {
            System.out.println("외부 입력 값이 없습니다.");
            System.exit(0); // 프로그램을 강제 종료합니다.
        }
        String strVal1 = args[0];
        String strVal2 = args[1];

        int num1 = Integer.parseInt(strVal1);
        int num2 = Integer.parseInt(strVal2);
        System.out.println("외부로부터 입력받은 값 : " + (num1 + num2));
    }
}
