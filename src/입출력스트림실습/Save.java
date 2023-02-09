package 입출력스트림실습;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Save implements Comparable<Save> {
    String name;
    int score;
    int score2;
    int score3;
    int total;


    public Save(String name, int score, int score2, int score3) {
        this.name = name;
        this.score = score;
        this.score2 = score2;
        this.score3 = score3;
    }
    public int getTotal() {
        return score + score2 + score3;
    }
    String getName() {
        return name;
    }

    @Override
    public int compareTo(Save o) {
        if (this.getTotal() == o.getTotal()) {
            return this.name.compareTo(o.name);
        } else if (this.getTotal() < o.getTotal()) return 1;
        else return -1;
    }
}
