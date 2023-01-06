package 평균구하기;

import java.util.Scanner;

//5명의 학생이 시험을 치는데 시험 점수가 40점 미만이면 보충수업을 듣는 조건으로 40점으로 수정
//모든 학생이 40점 미만인 경우 보충수업을 듣기로 함
//모든 학생의 성적에 대한 평균 구하기
public class ArrayAver {
    public static void main(String[] args) {
        int score[] = new int[5];
        int sum = 0;
        while (true) {
            for (int i = 0; i < score.length; i++) {
                System.out.println("성적을 입력하세요.");
                Scanner sc = new Scanner(System.in);
                score[i] = sc.nextInt();
                if (score[i] < 40) score[i] = 40;
                    sum += score[i];
            }
            System.out.printf("%.2f\n", (double)sum/5);
        }
    }
}
