package 클래스정렬연습문제;

import java.util.Scanner;
import java.util.TreeSet;

//문제 : 첫 번째 줄에 학생의 수 N을 입력
// 두번째 줄부터 학생의 이름과 성적을 공백 기준으로 입력
//3
//안유진 95
//정국 88
//유나 77
//출력 조건 :ㅣ 모든 학생의 이름을 성적이 낮은 순서대로 출력하기.
public class ClassSortEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수를 입력하세요. : ");
        int num = sc.nextInt();
        TreeSet<Students> ts= new TreeSet<>(new ScoreSort());
        for(int i = 0; i < num; i++) {
            ts.add(new Students(sc.next(), sc.nextInt()));
        }
        for(Students e : ts) {
            System.out.print(e.name + " ");
        }
    }
}
