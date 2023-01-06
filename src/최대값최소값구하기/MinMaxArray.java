package 최대값최소값구하기;

import java.util.Scanner;

//정수를 입력 받음(배열의 갯수)
//입력받은 정수의 크기만큼 배열 생성
//배열의 크기만큼 순회하면서 임의의 정수 값 입력
//입력 받은 배열에서 최소값과 최대값 출력
//정수값 입력 : 10
//
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값을 입력하세요. : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        while (true) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("배열에 들어갈 정수값을 추가로 입력하세요.");
                array[i] = sc.nextInt();
            }
            int min = array[0];
            int max = array[0];
            /*for(int e : array) {
                if(min > e) min = e; // 향상된 for문을 이용한 방법.
                if(max < e) max = e;*/
            for(int i= 0; i < array.length; i++) {
                if(min > array[i]) min = array[1];
                if(max < array[i]) max = array[1];
            }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
        }
    }
}