package 블랙잭;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("총 카드 장수와 총합을 입력하세요.");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int rst = 0;
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            }
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                for(int k = j+1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= M && rst < sum) rst = sum;
                }
            }
        }
    }
}
