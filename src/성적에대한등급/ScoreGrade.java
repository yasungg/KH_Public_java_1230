package 성적에대한등급;
//성적을 입력 받음
//입력받은 성적이 0~100 사이가 아니면 "성적을 잘못 입력하였습니다." 라고 출력
// 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 나머지는 F로 출력.
import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하십시오. : ");
        int score = sc.nextInt();
        if (0 > score && score > 100) {
            System.out.println("성적을 잘못 입력하셨습니다.");
        }
        if (score >= 90) {System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else System.out.println("F");
    }
}