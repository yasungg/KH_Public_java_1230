package 암호체크;

import java.util.Scanner;

//암호체크
//암호의 길이는 10~30자 사이(10<= length <=30);
//암호에는 숫자, 소문자, 대문자, 특수문자가 포함되어야 함
//특수문자는 (!, %, _, #, &, +, -, *, /) 9개중 하나
//입력받은 패스워드가 조건을 만족하면 'Good Password' 아니면 'Bad Password'
//반복문을 사용하고 사용자가 "종료" 또는 "exit"을 입력하면 종료
public class PasswordCheckEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd; // 암호를 입력받기 위한 변수
        while (true) {
            System.out.print("암호를 입력해주세요. : ");
            pwd = sc.next();
            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;
            if (!pwdCheck.validLength(pwd)) {
                System.out.println("Bad password length!!");
                continue;
            }
            if (!pwdCheck.validNumber(pwd)) {
                System.out.println("Bad password number!!");
                continue;
            }
            if (!pwdCheck.validLowerAlphabet(pwd)) {
                System.out.println("BAD Lower Alphabet!!");
                continue;
            }
            if (!pwdCheck.validUpperAlphabet(pwd)) {
                System.out.println("BAD Upper Alphabet!!");
                continue;
            }
            if (!pwdCheck.validRex(pwd))
                System.out.println("Add special letter!!");
                continue;
        }
        System.out.println("GOOD Password!!");
    }
}
