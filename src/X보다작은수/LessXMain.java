package X보다작은수;

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
        int[] A = new int[N];
        int tmp = 0;
        int X = 0;
        int index = 0;
        boolean isExist = false;
        while (true) {
            tmp = ((int)(Math.random() * 10000));
            for(int i = 1; i <= A.length+1 && i >= 1;) {
                if(A[i] == tmp) isExist = true;
            }
            if(isExist == false) A[index++] = tmp;
            if(index == 10000) break;
            isExist = false;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
