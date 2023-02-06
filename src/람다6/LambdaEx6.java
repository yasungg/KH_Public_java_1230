package 람다6;

import java.util.function.ToIntBiFunction;

//매개변수의 메소드 참조
//ToIntBiFunction<String, String> : 두 개의 문자열을 입력받아 int값을 반환
//compareToIgnoreCase() : 대소문자 관계 없이 문자열을 ASCII코드 값으로 비교 후 결과를 반환
public class LambdaEx6 {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;
        function = (a, b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA9"));

        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Java8", "JAVA9"));


    }
    static void print(int order) {
        if(order < 0) System.out.println("사전 순으로 먼저 나옵니다.");
        else if(order == 0) System.out.println("동일한 문자열입니다.");
        else System.out.println("사전순으로 나중에 나옵니다.");
    }
}
