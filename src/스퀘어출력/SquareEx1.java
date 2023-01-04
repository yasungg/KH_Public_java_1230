package 스퀘어출력;

import java.util.Scanner;

public class SquareEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. :");
        int n = sc.nextInt();
        for (int i = 1; i <= n*n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
            }
        }
    }