package 문자열반전;

import java.util.Scanner;

// abcdefg => gfedcba
public class StringReverseEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();
        int index = str.length();
        /*while(index > 0) {
            index--; // 인덱스는 문자열 길이 -1
            System.out.print(str.charAt(index));*/
        for(int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
