package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//첫째줄에 N과 X가 주어짐.
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
//주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
// 10 5/ 10 = 배열의 갯수, 5 =>찾을 수
//1 10 4 9 2 3 8 5 7 6
//결과값 1 4 2 3
public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N값을 입력하세요. : ");
        int N = sc.nextInt();
        System.out.print("X값을 입력하세요. : ");
        int X = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        int tmp;
        int random = 0;
        for(int i = 0; i < N; i++) {
            random = (int)(Math.random() * 10000 + 1);
            A.add(random);
        }
        for(Integer e : A) {
            if(e > X) System.out.println(e);
        }
    }

}
