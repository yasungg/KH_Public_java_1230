package 암호만들기복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncryptFinalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine(); // 평문 입력받음
        System.out.print("암호문 : ");
        String encrypt = sc.next(); // 암호문구 계속 반복(평문길이만큼 계속 반복
        char[] enc = encrypt.toCharArray();//문자열을 문자 배열로 변경
        char value = 0;// 리스트에 담기 전에
        List<Character> vig = new ArrayList<>();

        for(int i = 0; i < normal.length(); i++) { // 평문의 길이만큼 순회
            if(normal.charAt(i) == ' ') vig.add(' '); // 공백인 경우에는 그냥 공백 처리
            else {
                value = (char)(normal.charAt(i) - (enc[i % encrypt.length()] - 'a') - 1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }
        for(Character e : vig) System.out.print(e);
    }
}
