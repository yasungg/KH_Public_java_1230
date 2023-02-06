package 스트림3번;

import java.util.ArrayList;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("박채영", 99));
        list.add(new Student("김지수", 100));
        list.add(new Student("김채원", 85));

        double avg = list.stream()
                .mapToInt(Student::getScore)// 메소드 참조 문법이며, 중간 처리연산
                // 최종연산
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);
    }
}
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}