package 구간합구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SectionSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수의 개수를 입력하세요. : ");
        int N = sc.nextInt();
        System.out.print("합을 구해야하는 갯수를 입력하세요 : ");
        int M = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("배열에 입력할 수를 앞서 입력한 수의 갯수만큼 입력하세요.");
        for (int i = 1; i <= N; i++) arr.add(sc.nextInt());

        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            System.out.println("======[" + (i+1) + "]======");
            System.out.print("배열의 첫째값 : ");
            int min = sc.nextInt();
            System.out.print("배열의 마지막값 : ");
            int max = sc.nextInt();
            if(max < min) System.out.println("배열의 첫째 값은 마지막 값을 넘을 수 없습니다.");
            rst.add(arr.get(max-1) - arr.get(min-1));
        }
        System.out.println(rst);
        System.out.println("직접 풀었다!!!!!!!!!!!!!!!!");
    }
}