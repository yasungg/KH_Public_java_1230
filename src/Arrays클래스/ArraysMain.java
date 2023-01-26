package Arrays클래스;

import java.util.Arrays;
import java.util.Scanner;

//Arrays클래스는 배열을 다루기 위한 다양한 메소드를 포함하고 있다.
public class ArraysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수를 입력 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * num) + 1;
        }
        //배열의 값 정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// 배열을 문자열로 찍어줌
        int rst = Arrays.binarySearch(arr, key); // 해당 위치를 반환해줌
        if(rst >= 0) System.out.println("결과 : " + rst);
        else System.out.println("해당 수를 찾지 못했습니다.");
    }
}
