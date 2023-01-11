package 홀수짝수나누어담기;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddArray {
    /*int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int evenIdx = 0;
    int oddIdx = 0;

    void inputVal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
    }

    void seperateVal() {
        for (int e : inputArr) {
            if (e % 2 == 0) evenArr[evenIdx++] = e;
            else oddArr[oddIdx++] = e;
        }
    }

    void displayVal() {
        System.out.print("홀수 : ");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.println();
        System.out.print("짝수 : ");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(evenArr[i] + " ");
        }
    }*/
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    void inputVal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int value = 0;
        while (true) {
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value);
        }
    }
    void seperateVal() {
        for(int e : inList) {
            if(e % 2 == 0) evenList.add(e);
        }
    }
    void displayVal() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        for(int e : evenList) System.out.print(e + " ");
    }
}

