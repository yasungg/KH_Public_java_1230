package 스트림2번;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("박채영", 89));
        list.add(new Student("김지수", 99));
        list.stream().forEach(s->{ // parallelStream() : 코어를 쪼개서 동시에 여러 연산이 진행되도록 할 수 있음. 큰 데이터 처리할 시에 이점이 생김.
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " : " + score);
        });
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