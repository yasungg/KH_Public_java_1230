package 클래스정렬연습문제;

import java.util.Comparator;
import java.util.Scanner;

public class Students {
    String name;
    int score;

    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class ScoreSort implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if(o1.score == o2.score) {
            return o1.name.compareTo(o2.name); // 성적이 같은 경우 이름 사전 순서대로 정렬
        }
        return o1.score - o2.score;
    }
}