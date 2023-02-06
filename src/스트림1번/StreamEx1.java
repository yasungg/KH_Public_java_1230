package 스트림1번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

//스트림은 배열, 컬렉션은 등의 자료를 일관성 있게 처리하게함(자료의 대상과 관계없이 동일한 연산 수행)
//한 번 생성하면 한 번만 사용 가능, 원본 데이터를 변경하지 않음, 병렬 처리 지원, 내부 반복자 사용.
//스트림의 동작은 생성 -> 중간 연산 -> 최종 연산
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        //list.stream().filter(s->s.intValue() >= 5).forEach(s->System.out.println(s));
        //mapToInt() : 스트림을 IntStream으로 변환해주는 메소드.
        int sum = list.stream().mapToInt(e->e).sum();
        int count = (int)list.stream().mapToInt(e->e).count();
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);
    }
}
