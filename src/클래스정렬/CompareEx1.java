package 클래스정렬;
//Comparable/Comparator ? 클래스 정렬을 구현할 수 있도록 해주는 인터페이스

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class CompareEx1 {
    public static void main(String[] args) {
        TreeSet<CarEx> ts = new TreeSet<>();
        ts.add(new CarEx("Santafe", 2022, "White"));
        ts.add(new CarEx("Sonata", 2014, "Gray"));
        ts.add(new CarEx("Grandeur", 1999, "White"));
        ts.add(new CarEx("Sorento", 2022, "Red"));

        for(CarEx e : ts) {
            System.out.println("차종 : " + e.modelName);
            System.out.println("연식 : " + e.modelYear);
            System.out.println("색상 : " + e.color);
            System.out.println("-------------------------");
        }
    }
}
