package 객체비교복습;
//10명의 성적을 입력받음(미리 만들어둠)
//이름 국어 영어 수학
//총점이 높은 순으로 정렬하고 총점이 같으면 이름 순으로 정렬
//cmoparator, comparable, collection의 sort를 이용하는 법 등
//treeset : 정렬해주는 특성, 중복을 허용하지 않는 특성.


import java.util.Iterator;
import java.util.TreeSet;

public class ObjectCompFinal {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("박채영", 95, 100, 79));
        info.add(new StudentInfo("김채원", 87, 76, 59));
        info.add(new StudentInfo("김지수", 97, 74, 67));
        info.add(new StudentInfo("안유진", 85, 77, 89));
        info.add(new StudentInfo("유지민", 77, 57, 89));
        info.add(new StudentInfo("지민정", 57, 77, 89));

        /*for(StudentInfo e : info) {
            System.out.println(e.getTotal() + " : " + e.getName());
        }*/

        Iterator<StudentInfo> iterator = info.iterator();
        while(iterator.hasNext()) {
            StudentInfo next = iterator.next();
            System.out.println(next.getTotal() + " : " + next.getName());
        }
    }
}
class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentInfo(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor + eng + math;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal();

    }
}