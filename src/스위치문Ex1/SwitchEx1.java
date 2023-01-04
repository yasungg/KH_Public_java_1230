package 스위치문Ex1;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요. : ");
        String season = sc.next();
        switch(season) {
            case "spring" : //해당 조건이 실행된다.
                System.out.println("봄이 그렇게도 좋냐 멍청이들아.");
                break; // 해당 조건을 종료한다.
            case "summer" :
                System.out.println("래쉬가드 말고 비키니 입으세요.");
                break;
            case "autumn" :
            case "fall" : // 이와 같이 케이스를 여러 가지 쓸 수도 있다.
                System.out.println("가을이 왔어요 코트 꺼냅시다.");
                break;
            case "winter" :
                System.out.println("코끝에 겨울");
                break;
            default :
                System.out.println("계절 이름도 모르냐?");
        }
    }
}
