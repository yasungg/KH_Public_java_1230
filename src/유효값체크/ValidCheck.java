package 유효값체크;

import java.util.Scanner;
//while문은 먼저 조건을 확인하고 반복문을 수행
//do ~while문은 먼저 수행하고 조건을 확인함.
public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        /*while(true) {
            System.out.print("나이를 입력하세요. " );
            age = sc.nextInt(); // 정상적인 입력이 될때까지 반복적으로 나이를 입력받음
            if(age > 0 && age < 200) {
                break; // 조건을 만족하면 반복문을 탈출한다.
            }
                System.out.println("나이를 잘못 입력하셨습니다.");
            }
            System.out.println("입력하신 나이는 " + age + "세 입니다. 맞습니까?");*/
        do {
            System.out.println("나이를 입력하세요. : ");
            age = sc.nextInt();
        } while(age <= 0 || age >= 200);
    }
}
        //System.out.println("나이를 잘못 입력하였습니다.");