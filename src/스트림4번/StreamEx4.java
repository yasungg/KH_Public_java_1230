package 스트림4번;
//스트림 자바8 버전에 추가된 문법임
//Stream은 객체 요소를 처리하는 스트림(IntStream, LongStream, DoubleStream)
//각각의 기본 타입인 int, long, double 요소를 처리하는 스트림.
//자바에서 제공하는 모든 컬렉션의 최고 상위 조상인 Collection 인터페이스에는 stream()메소드가 정의되어 있음.

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx4 {
    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //list.stream().forEach(s->System.out.print(s)); // 메소드 참조 문법을 사용할 수 있음.
        IntStream stream = IntStream.rangeClosed(1, 100); // 1부터 100까지의 합
        int sum = stream.sum();
        System.out.println(sum);
    }
}
