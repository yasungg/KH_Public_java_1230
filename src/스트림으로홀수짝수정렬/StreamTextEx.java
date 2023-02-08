package 스트림으로홀수짝수정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamTextEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("7개의 정수를 입력하세요. : ");
        for(int i = 0; i < 7; i++) {
            arr.add(sc.nextInt());
        }
        arr.stream().filter(n -> n % 2 != 0).forEach(n ->System.out.print(n + " "));
        System.out.println();
        arr.stream().filter(n -> n % 2 == 0).forEach(n ->System.out.print(n + " "));
    }
}
