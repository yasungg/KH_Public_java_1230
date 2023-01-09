package 문자열추가;

import java.util.Scanner;

//두 개의 문자열을 입력받고, 정수 n값을 입력 받음.
//첫번재 문자열 입력 seoul
//두번째 문자열 입력 korea
//정수값 입력 2
//ulkorea
//첫번째 문자열의 둣 부분의 n개 문자를 두 번째 문자열 앞에 끼워넣는 코드 작성.
public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 문자열을 입력하세요. : ");
        String str1 = sc.next();
        System.out.println("두 번째 문자열을 입력하세요. : ");
        String str2 = sc.next();
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        String last = str1.substring((str1.length()-num), str1.length());
            System.out.println(last + str2);
        }

    }
