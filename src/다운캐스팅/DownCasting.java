package 다운캐스팅;

import java.util.ArrayList;

//Casting : 형 변환을 의미함.(주로 부모타입의 참조 변수로 자식 객체로 접근)
//다운캐스팅 : 상위클래스형으로 변환되었던 하위 클래스를다시 원래 자료형으로 변환하는 것
//instanceof : 형 변환 가능 여부를 확인(참조 변수가 참조하고 있는 객체의 실제 타입을 확인)
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();

    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }
    public void addAnimal() {
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        aniList.add(new Eagle());
        for(Animal e : aniList) e.move();
        System.out.println(" ");
    }
    public void  testCasting() {
        for(int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // get은 index로 리스트의 요소값을 읽는것
            ani.move();
            if(ani instanceof Human) {
                Human h = (Human) ani;
                h.readBook();
            } else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else System.out.println("지원되지 않습니다.");
        }
    }
}
