package 예시;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        for(int i = 1; i <=20; i++) {
            int result = i % 5;
            switch(result) {
                case 0 :
                    System.out.println(i + " : 5의 배수입니다.");
                default :
                    System.out.println(i + " : 5의 배수가 아닙니다.");
            }
        }
    }
}

