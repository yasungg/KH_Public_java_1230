package 대소문자변경;

import java.util.Scanner;
//영문자만 입력이된다.
//입력받은 문자열에서 대문자는 소문자로 소문자는 대문자로 변경하기.
//toUpperCase=> TOuPPERcASE 이렇게 바뀌어야 한다는 것.
//힌트1. 문자열에서 특정 문자를 추출하는 방법을 charAt()
//힌트2. 문자는 내부적으로 정수값으로 간주되어 사용된다.
//힌트3. 값을 출력할 때에는 정수값이 아닌 문자로 표현하기 위해서는 형변환이 필요하다.
public class UpperLowerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요. : ");
        String str = sc.next();
        char ch; // 문자열의 인덱스에 해당하는 문자를 담을 변수
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // 문자열에 해당 인덱스 문자를 추출
            if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));
            }
        }
    }
