package 제네릭;

import java.util.ArrayList;
import java.util.List;

//제네릭이란 ? 데이터타입을 일반화한다는 의미. 즉, 데이터 형식에 의존하지 않고
//하나의 값이 여러 다른 데이터 타입을 가질 수 있도록 하는 방법.
// - 컴파일 시, 강한 타입을 체크
// - 타입 변환을 제거
//제네릭 타입의 선언 : public class 클래스명 <T> {.....}
//<T>는 타입 변수를 의미 이름은 T가 아니어도 되지만 일반적으로 T를 많이 씀
public class GenericEx {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("박채영");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(26);
        System.out.println(p2.info + "세");
    }
}

class Person <T> {
    public T info;
    Person(T info) {
        this.info = info;
    }
}