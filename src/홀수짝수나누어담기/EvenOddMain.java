package 홀수짝수나누어담기;

import java.util.Scanner;

//일곱개의 정수를 입력받아 홀수와 짝수를 각각의 배열에 나누어 담기
//첫번째 메소드는 7개의 정수를 입력받는 메소드
//홀수와 짝수를 나누어 담는 메소드
//3번째 메소드는 결과를 출력하는 메소드
//inputArr[]
//oddArr[]
//evenArr[]
//입력 1,2,3,4,5,6,7
public class EvenOddMain {
    public static void main(String[] args) {
        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.inputVal();
        evenOddArray.seperateVal();
        evenOddArray.displayVal();
        }
    }
