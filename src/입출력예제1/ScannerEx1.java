package 입출력예제1;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next(); //문자열을 공백 기준으로 입력받음.
        sc.nextLine(); // 스캐너 입력 버퍼 지우기
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine(); //문자열을 줄바꿈 기준으로 입력받음.
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0); // 문자열 가장 첫 문자를 추출하여 입력받음.
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("전화번호를 입력하세요 : ");
        String phoneNumber = sc.next();
        System.out.println("======== 회원 정보 출력 ========");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("전화번호 : " + phoneNumber);

    }
}
