package 스퀘어출력2;

import java.util.Scanner;
//구구단 만들기
public class DoubleForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


