package 스트림6번;
//스트림 중개 연산 : 생성된 스트림은 중개 연산을 통해 또다른 스트림으로 변환
//중개연산은 연속으로 연결해서 여러개 사용이 가능
//filter() : 해당 스트림에서 주어진 조건에 맞는 요소로만 구성된 새로운 스트림 반환.
//distinct() : 요소의 중복을 제거(내부적으로 equals()메소드 사용)


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx6 { // 해당 폴더 하위 파일 이름 전체 출력
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,1,2,3,4,5,6,7);
        //stream에서 중복 요소 제거
        stream1.distinct().forEach(e->System.out.print(e + " "));
        System.out.println();
        //stream에서 홀수만 골라내기
        stream2.filter(n->n % 2 != 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        //Map() 사용
        Stream<String> stream3 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream3.map(s->s.length()).forEach(System.out::println);
        //flatMap()
        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        //limit() : 해당 스트림의 첫 번재 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환
        IntStream stream4 = IntStream.range(0, 10);
        stream4.limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        //skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 스트림 반환
        IntStream stream5 = IntStream.range(0, 10);
        stream5.skip(5).forEach(n -> System.out.print(n + " "));
        //skip과 limit 함께 사용하기
        IntStream stream6 = IntStream.range(0, 10);
        stream6.skip(3).limit(5).forEach((n -> System.out.print(n + " ")));
        System.out.println();
        //스트림 정렬 sorted() : 해당 스트림을 주어진 비교지(comparator)를 이용하여 정렬
        Stream<String> stream7 = Stream.of("JAVA", "HTML", "CSS", "JAVASCRIPT");
        stream7.sorted().forEach(s->System.out.print(s + " "));
        System.out.println();

        Stream<String> stream8 = Stream.of("JAVA", "HTML", "CSS", "JAVASCRIPT");
        stream8.sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s + " "));
    }
}
